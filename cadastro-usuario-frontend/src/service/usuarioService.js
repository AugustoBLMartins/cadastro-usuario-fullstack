import apiFront from "../api/api";

export default {
  listar() {
    return apiFront.get("/usuario");
  },

  buscarPorId(id) {
    return apiFront.get(`/usuario/id?id=${id}`);
  },

  criar(usuario) {
    return apiFront.post("/usuario", usuario);
  },

  atualizar(id, usuario) {
    return apiFront.put(`/usuario?id=${id}`, usuario);
  },

  deletar(email) {
    return apiFront.delete(`/usuario?email=${email}`);
  }
};