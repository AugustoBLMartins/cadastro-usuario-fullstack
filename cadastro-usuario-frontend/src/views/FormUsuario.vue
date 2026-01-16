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

      <button type="submit">Salvar</button>
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
        nome: "",
        email: "",
      },
    };
  },

  methods: {
    salvar() {
      usuarioService.criar(this.usuario)
        .then(() => {
          alert("Usuário cadastrado com sucesso!");
          this.$router.push("/");
        })
        .catch(error => {
          console.error(error);
          alert("Erro ao cadastrar usuário");
        });
    },
  },
};
</script>
