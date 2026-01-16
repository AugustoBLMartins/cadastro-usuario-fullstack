<template>
  <div>
    <h2>{{ usuario.id ? "Editar Usuário" : "Novo Usuário" }}</h2>

    <form @submit.prevent="salvar">
      <div>
        <label>Nome</label><br />
        <input v-model="usuario.nome" type="text" required />
      </div>

      <div>
        <label>Email</label><br />
        <input v-model="usuario.email" type="email" required />
      </div>

      <button type="submit" class="btn-novo">
        {{ usuario.id ? "Atualizar" : "Salvar" }}
      </button>
    </form>
  </div>
</template>

<script>
import usuarioService from "../service/usuarioService";

export default {
  props: ['id'], // recebe id da rota /editar/:id
  data() {
    return {
      usuario: {
        id: null,
        nome: "",
        email: ""
      }
    };
  },

  mounted() {
    if (this.id) {
      // Detecta automaticamente edição
      usuarioService.buscarPorId(this.id)
        .then(res => {
          // Atribui o ID junto com os outros dados
          this.usuario = { ...res.data, id: this.id };
        })
        .catch(err => {
          console.error("Erro ao carregar usuário:", err);
          alert("Não foi possível carregar os dados do usuário.");
          this.$router.push('/'); // volta para a lista se der erro
        });
    }
  },

  methods: {
    salvar() {
      if (!this.usuario.nome || !this.usuario.email) {
        alert("Preencha todos os campos!");
        return;
      }

      if (this.usuario.id) {
        // Atualização
        usuarioService.atualizar(this.usuario.id, this.usuario)
          .then(() => {
            alert("Usuário atualizado com sucesso!");
            this.$router.push('/');
          })
          .catch(err => {
            console.error(err);
            alert("Erro ao atualizar usuário.");
          });
      } else {
        // Criação
        usuarioService.criar(this.usuario)
          .then(() => {
            alert("Usuário criado com sucesso!");
            this.$router.push('/');
          })
          .catch(err => {
            console.error(err);
            alert("Erro ao criar usuário.");
          });
      }
    }
  }
};
</script>
