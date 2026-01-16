import { createRouter, createWebHistory } from "vue-router";
import ListaUsuarios from "../views/ListaUsuarios.vue";
import FormUsuario from "../views/FormUsuario.vue";

const routes = [
  { path: "/", component: ListaUsuarios },
  { path: "/novo", component: FormUsuario },
  { path: "/editar/:id", component: FormUsuario, props: true },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
