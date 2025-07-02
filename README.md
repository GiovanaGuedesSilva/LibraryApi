# Library API

API RESTful desenvolvida em Java com Spring Boot para gerenciar um sistema de biblioteca. Ela permite o cadastro, listagem, atualização e exclusão de livros.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Maven

## 📁 Estrutura do Projeto

```
LibraryApi
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.libraryapi
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── LibraryApiApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql (opcional)
│   └── test
│       └── java
│           └── com.example.libraryapi
│               └── LibraryApiApplicationTests.java
```

## 🧪 Funcionalidades

- ✅ Criar um novo livro
- ✅ Listar todos os livros
- ✅ Buscar um livro por ID
- ✅ Atualizar dados de um livro
- ✅ Deletar um livro

## 🔌 Endpoints da API

| Método | Endpoint           | Descrição              |
|--------|--------------------|------------------------|
| GET    | `/books`           | Lista todos os livros  |
| GET    | `/books/{id}`      | Busca livro por ID     |
| POST   | `/books`           | Cria um novo livro     |
| PUT    | `/books/{id}`      | Atualiza um livro      |
| DELETE | `/books/{id}`      | Deleta um livro        |

## ⚙️ Configuração e Execução

1. Clone o repositório:

```bash
git clone https://github.com/GiovanaGuedesSilva/LibraryApi.git
cd LibraryApi
```

2. Compile e rode com Maven:

```bash
./mvnw spring-boot:run
```

Ou execute diretamente a classe `LibraryApiApplication.java` pela sua IDE.

3. Acesse no navegador:
```
http://localhost:8080/books
```

## 🛢 Banco de Dados

Este projeto utiliza o banco H2 (em memória) e pode ser acessado em:

```
http://localhost:8080/h2-console
```

- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: (deixe em branco)

## ✅ Requisitos

- Java 17 ou superior
- Maven 3.8+

## 📌 Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
