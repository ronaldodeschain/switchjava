# Sistema de Cadastro de Processos Judiciais

Este projeto é um sistema simples de console (CLI) para cadastro e gerenciamento de processos judiciais, desenvolvido como exercício para a disciplina de Programação Orientada a Objetos (POO) do Senac.

A aplicação permite cadastrar diferentes tipos de entidades (Pessoas Físicas, Pessoas Jurídicas, Advogados, Juízes) e Processos, além de associá-las entre si, demonstrando conceitos fundamentais de POO como encapsulamento, herança e polimorfismo.

## ✨ Funcionalidades

O sistema é controlado por um menu interativo no console e oferece as seguintes opções:

*   **Cadastro de Entidades:**
    *   Cadastrar Pessoa Física (com nome, email, endereço, telefone, CPF e idade).
    *   Cadastrar Pessoa Jurídica (com nome, email, endereço, telefone e CNPJ).
    *   Cadastrar Advogado (com nome, email, endereço, telefone e OAB).
    *   Cadastrar Juiz (com nome, email, endereço, telefone e Carteira de Magistrado).
*   **Cadastro de Processos:**
    *   Criar novos processos com código e status.
*   **Associação de Entidades a Processos:**
    *   Adicionar uma ou mais Pessoas Físicas a um processo.
    *   Adicionar uma ou mais Pessoas Jurídicas a um processo.
    *   Definir o Advogado responsável por um processo.
    *   Definir o Juiz responsável por um processo.
*   **Listagem de Dados:**
    *   Listar todas as Pessoas Físicas cadastradas.
    *   Listar todas as Pessoas Jurídicas cadastradas.
    *   Listar todos os Advogados cadastrados.
    *   Listar todos os Juízes cadastrados.
    *   Listar todos os Processos cadastrados com seus detalhes e partes envolvidas.

## 🛠️ Tecnologias Utilizadas

*   **Java 17 (ou superior)**
*   **Paradigma de Programação Orientada a Objetos (POO)**

## 📂 Estrutura do Projeto

O código-fonte está organizado nas seguintes classes:

*   `Main.java`: Ponto de entrada da aplicação. Sua única responsabilidade é instanciar o `Controller` e iniciar o sistema.

*   `Controller.java`: O cérebro da aplicação. Gerencia o menu, a interação com o usuário via `Scanner`, e orquestra todas as operações de cadastro, associação e listagem.

*   `Pessoa.java`: Classe `abstract` que serve como base para todas as outras entidades "humanas" ou "jurídicas" do sistema. Contém atributos e métodos comuns como `nome`, `email`, `endereco` e `telefone`, promovendo o reuso de código através da **herança**.

*   `PessoaFisica.java`: Subclasse de `Pessoa`. Representa um indivíduo e adiciona os atributos `cpf` e `idade`.

*   `PessoaJuridica.java`: Subclasse de `Pessoa`. Representa uma empresa e adiciona o atributo `cnpj`.

*   `Advogado.java`: Subclasse de `Pessoa`. Representa um advogado e adiciona o atributo `oab`.

*   `Juiz.java`: Subclasse de `Pessoa`. Representa um juiz e adiciona o atributo `carteiraMagistrado`.

*   `Processo.java`: Representa um processo judicial. Utiliza o conceito de **composição** para agregar as partes envolvidas (advogado, juiz, pessoas físicas e jurídicas). Possui um método `toString()` sobrescrito para exibir os detalhes do processo de forma clara e organizada.

## 🚀 Como Executar o Projeto

Para compilar e executar o projeto, você precisará ter o JDK (Java Development Kit) instalado em sua máquina.

1.  **Navegue até o diretório do projeto:**
    Abra um terminal ou prompt de comando e use o comando `cd` para navegar até a pasta onde os arquivos `.java` estão localizados.

    ```bash
    cd caminho/para/switchjava
    ```

2.  **Compile os arquivos Java:**
    Execute o comando `javac` para compilar todos os arquivos `.java` para `.class`.

    ```bash
    javac *.java
    ```

3.  **Execute a aplicação:**
    Após a compilação, execute o programa principal usando o comando `java`.

    ```bash
    java Main
    ```

4.  **Interaja com o menu:**
    O menu do sistema será exibido no console. Digite o número da opção desejada e pressione `Enter` para interagir com a aplicação.

## 🧑‍💻 Autor

*   **Matheus Flores**
    *   mflores@senacrs.com.br

---
*Exercício desenvolvido para o curso de Programação Orientada a Objetos do Senac.*