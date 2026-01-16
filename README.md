# Cadastro de Usuários Fullstack

Um sistema completo de gerenciamento de usuários desenvolvido com Vue.js no frontend e Spring Boot no backend, permitindo criar, listar, editar e excluir usuários de forma rápida, intuitiva e segura.

Este projeto é ideal para quem quer demonstrar habilidades em desenvolvimento fullstack, integração frontend-backend e boas práticas em Git, REST APIs e Vue.js.

# 🚀 Funcionalidades

Criar Usuário: formulário simples e validado para adicionar novos usuários.

Listar Usuários: visualização de todos os usuários cadastrados em tempo real.

Editar Usuário: atualização de dados existentes, com o formulário preenchido automaticamente.

Excluir Usuário: remoção rápida e segura pelo email único.

Integração Fullstack: comunicação eficiente entre frontend (Vue.js) e backend (Spring Boot).

## Boas práticas:

Componentização no Vue.js

Rotas protegidas e nomeadas

Validação de dados no frontend

Manipulação adequada de promises e erros

Estrutura limpa e modular

# 🛠 Tecnologias Utilizadas

## Frontend:

Vue.js 3 (Composition API)

Vue Router

Axios

Tailwind CSS (estilo opcional)

## Backend:

Java 17

Spring Boot

Spring Data JPA

Banco de dados H2 (pode ser substituído por MySQL/PostgreSQL)

Maven

Controle de versão:

Git & GitHub

📂 Estrutura do Projeto
```
cadastro-usuario/
├── backend/
│   ├── src/main/java/com/augusto/cadastro_usuario
│   │   ├── controller/      # Controllers REST
│   │   ├── business/        # Regras de negócio
│   │   ├── infrastructure/
│   │   │   ├── entitys/    # Entidades JPA
│   │   │   └── repository/ # Repositórios JPA
│   └── application.properties
├── frontend/
│   ├── src/
│   │   ├── views/           # Componentes de página
│   │   ├── service/         # Chamadas Axios para API
│   │   ├── router/          # Configuração de rotas
│   │   └── App.vue
├── README.md
└── pom.xml / package.json
```

# ⚡ Como Rodar o Projeto
Backend (Spring Boot)

Navegue até a pasta backend/

Execute:
```
mvn clean install
mvn spring-boot:run
```
A aplicação estará rodando em: http://localhost:8080

# Frontend (Vue.js)

Navegue até a pasta frontend/

Instale as dependências:
```
npm install
```
Rode o servidor de desenvolvimento:
```
npm run serve
```
O frontend estará rodando em: http://localhost:5173 (ou porta configurada)

# 📌 Uso do CRUD

Acesse a lista de usuários na página inicial.

Clique em "Novo Usuário" para criar.

Clique em "Editar" para atualizar um usuário existente (o formulário será preenchido automaticamente).

Clique em "Excluir" para remover um usuário.

# 💡 Diferenciais do Projeto

Estrutura modular e escalável para aplicações futuras.

Uso de props e reatividade no Vue.js para otimizar formulários.

Tratamento de erros no frontend e backend para maior robustez.

Pronto para integração com banco de dados real e deploy em nuvem.

Demonstra conhecimento em desenvolvimento fullstack e boas práticas profissionais.

# 📞 Contato
```
Autor: Augusto Martins

GitHub: github.com/AugustoBLMartins

LinkedIn: linkedin.com/in/augustomartins
```
