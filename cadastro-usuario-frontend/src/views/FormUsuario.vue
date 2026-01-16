<template>
  <div>
    <h2>Novo Usuário</h2>

    <form @submit.prevent="salvar">
      <div>
        <label>Nome</label><br />
        <input v-model="usuario.nome" type="text" required />
      </div>

      <div>
        <label>Email</label><br />
        <input v-model="usuario.email" type="email" required />
      </div>

      <button type="submit" class="btn-novo">Salvar</button>
    </form>
  </div>
</template>

<script>
import usuarioService from "../service/usuarioService";

export default {
  name: "FormUsuario",

  data() {
    return {
      usuario: {
        id: null,
        nome: "",
        email: "",
      },
    };
  },

  methods: {
    salvar() {
      if (this.usuario.id) {
          usuarioService.atualizar(this.usuario.id, this.usuario)
          .then(() => this.$router.push('/'))
      } else {
        usuarioService.criar(this.usuario)
          .then(() => this.$router.push('/'))
      }
    }
  },
};
</script>
