<template>
  <div>
    <router-link to="/novo">Novo Usuário</router-link>

    <ul>
      <li v-for="usuario in usuarios" :key="usuario.id">
        {{ usuario.nome }} - {{ usuario.email }}

        <router-link :to="`/editar/${usuario.id}`">Editar</router-link>
        <button @click="remover(usuario.id)">Excluir</button>
      </li>
    </ul>
  </div>
</template>

<script>
import usuarioService from "../service/usuarioService";

export default {
  data() {
    return {
      usuarios: [],
    };
  },

  mounted() {
    this.carregarUsuarios();
  },

  methods: {
    carregarUsuarios() {
      usuarioService.listar().then(response => {
        this.usuarios = response.data;
      });
    },

    remover(id) {
      usuarioService.deletar(id).then(() => {
        this.carregarUsuarios();
      });
    },
  },
};
</script>
