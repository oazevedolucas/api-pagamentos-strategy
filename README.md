# API Pagamentos com Strategy Pattern

Bem-vindo ao repositório **API Pagamentos Strategy**! Este é um projeto em Java utilizando o framework Spring Boot para demonstrar a implementação do padrão de projeto **Strategy** em APIs de pagamentos. Acompanhe para entender como utilizar design patterns para criar soluções mais escaláveis e flexíveis no desenvolvimento backend.

![GitHub repo size](https://img.shields.io/github/repo-size/iuricode/README-template?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/iuricode/README-template?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/iuricode/README-template?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/iuricode/README-template?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/iuricode/README-template?style=for-the-badge)

## 📊 Visão Geral

Este repositório contém o código da aula [**API de Pagamentos com Strategy Pattern**](https://youtu.be/5diCOJ22ht8). Aprenda a:

- Implementar o padrão **Strategy** para gerenciar diferentes métodos de pagamento.
- Criar uma arquitetura limpa e organizada.
- Utilizar Spring Boot para desenvolver APIs robustas e manuteníveis.

<div align="center">
  <img src="https://i.imgur.com/LOCOAbY.png" alt="Strategy Pattern" width="600px">
</div>

---

## ⚡ Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias:

- **Java 17**
- **Spring Boot**
- **Maven**

---

## 🔧 Como Executar o Projeto

Siga as etapas abaixo para executar este projeto localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/oazevedolucas/api-pagamentos-strategy.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd api-pagamentos-strategy
   ```

3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

4. Inicie a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse a API em:
   [http://localhost:8080](http://localhost:8080)

---

## 🔬 Estrutura do Projeto

A arquitetura segue boas práticas de organização, como separação de responsabilidades:

```
src/
|-- main/
|   |-- java/
|   |   |-- com.lucasazevedo.api_pagamentos/
|   |       |-- service/             # Implementação dos services e context
|   |       |   |-- strategy/        # Implementação do padrão Strategy
|   |       |-- controller/          # Controladores REST
|   |       |-- dtos/                # DTOs para o FRONT.
```

---

## 🚀 Aprenda Mais

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Design Pattern Strategy](https://refactoring.guru/design-patterns/strategy)
---

## 👥 Autor

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/oazevedolucas">
        <img src="https://avatars.githubusercontent.com/u/49877556?v=4" width="100px;" alt="Foto do Lucas Azevedo no GitHub"/>
        <br/>
        <sub>
          <b>Lucas Azevedo</b>
        </sub>
      </a>
      <br/>
      <a href="https://www.linkedin.com/in/oazevedolucas">LinkedIn</a> |
      <a href="https://github.com/oazevedolucas">GitHub</a>
    </td>
  </tr>
</table>

---

**Assista ao vídeo completo da aula:** [YouTube - API de Pagamentos com Strategy](https://youtu.be/5diCOJ22ht8).

