import axios from "axios";

const apiFront = axios.create({
  baseURL: "http://localhost:8080", // porta Spring
});

export default apiFront;
