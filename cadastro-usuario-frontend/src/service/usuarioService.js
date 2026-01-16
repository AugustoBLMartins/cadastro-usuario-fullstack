import apiFront from "../api/api";

export default {
  listar() {
    return apiFront.get("/usuario");
  },

  criar(usuario) {
    return apiFront.post("/usuario", usuario);
  },
};
