import { createRouter, createWebHistory } from "vue-router";
import ListaUsuarios from "../views/ListaUsuarios.vue";
import FormUsuario from "../views/FormUsuario.vue";

const routes = [
  {
    path: "/",
    name: "listaUsuarios",
    component: ListaUsuarios
  },
  {
    path: "/novo",
    name: "novoUsuario",
    component: FormUsuario
  },
  {
    path: "/editar/:id",
    name: "editarUsuario",
    component: FormUsuario,
    props: true   // permite receber `id` diretamente como prop
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
