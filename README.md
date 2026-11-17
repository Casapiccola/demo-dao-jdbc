# Java JDBC — Padrão DAO

Projeto de estudos em **Java e JDBC**, inspirado em exercícios de persistência relacional. A aplicação utiliza o **padrão DAO (Data Access Object)** para separar a lógica de acesso ao banco das entidades e da execução do programa.

## O que o projeto demonstra

- Conexão com banco de dados via JDBC (`DriverManager`).
- Consultas por ID, consultas completas e filtro por departamento.
- Operações de **inserção, atualização e exclusão** em uma tabela de vendedores.
- Uso de `PreparedStatement`, `ResultSet` e tratamento de exceções.
- Organização em entidades (`Seller`, `Department`), interfaces DAO e implementações JDBC.

## Estrutura

```text
src/
├── application/           # Programas de execução dos exemplos
├── db/                    # Gerenciamento de conexão e exceções
└── model/
    ├── entities/          # Seller e Department
    └── dao/               # Interfaces, fábrica DAO e implementações JDBC
```

## Para executar localmente

1. Tenha um JDK e um banco de dados relacional compatível com o JDBC utilizado.
2. Configure no projeto o driver JDBC do banco escolhido.
3. Prepare as tabelas de **vendedores** e **departamentos** e dados de exemplo compatíveis com as consultas do código.
4. Na raiz do projeto, crie um arquivo local `db.properties` com as propriedades de conexão aceitas pelo seu driver. Exemplo para MySQL:

```properties
dburl=jdbc:mysql://localhost:3306/nome_do_seu_banco
user=seu_usuario_local
password=sua_senha_local
```

5. Execute a classe `application.Program` na sua IDE e acompanhe as operações no console.

> **Atenção:** o programa usa alguns IDs fixos de exemplo e executa `INSERT`, `UPDATE` e `DELETE`. Rode apenas em um banco de **testes**. Não versione `db.properties` com credenciais reais.

## Contexto

Repositório **educacional** voltado a fundamentos de persistência, SQL e organização de código. Não é uma aplicação de produção.

[Voltar ao perfil](https://github.com/Casapiccola)
