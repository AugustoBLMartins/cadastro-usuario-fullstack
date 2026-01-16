import apiFront from "../api/api";

export default {
  listar() {
    return apiFront.get("/usuario");
  },

  criar(usuario) {
    return apiFront.post("/usuario", usuario);
  },

    deletar(email) {
    return apiFront.delete(`/usuario?email=${email}`);
  },

    atualizar(id, usuario) {
    return api.put(`/usuario/${id}`, usuario)
  }
};
