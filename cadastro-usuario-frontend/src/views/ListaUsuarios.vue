<template>
  <div>
    <router-link :to="{ name: 'novoUsuario' }" class="btn-novo">Novo Usuário</router-link>

    <ul>
      <li v-for="usuario in usuarios" :key="usuario.id">
        {{ usuario.nome }} - {{ usuario.email }}

        <button @click="editar(usuario)" class="btn-editar">Editar</button>
        <button @click="remover(usuario.email)" class="btn-remover">Excluir</button>
      </li>
    </ul>
  </div>
</template>

<script>
import usuarioService from "../service/usuarioService";

export default {
  data() {
    return {
      usuarios: []
    };
  },

  mounted() {
    this.carregarUsuarios();
  },

  methods: {
    editar(usuario) {
      // usa params da rota para editar
      this.$router.push({ name: "editarUsuario", params: { id: usuario.id } });
    },

    carregarUsuarios() {
      usuarioService.listar().then(response => {
        this.usuarios = response.data;
      });
    },

    remover(email) {
      usuarioService.deletar(email).then(() => {
        this.carregarUsuarios();
      });
    }
  }
};
</script>
