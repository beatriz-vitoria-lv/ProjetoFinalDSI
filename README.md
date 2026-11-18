# Controle de Empréstimos de Livros

## Informações do Projeto

- **Aluno:** Beatriz Vitória Lourenço Vitoriano
- **Turma:** Desenvolvimento de Sistemas - Noturno
- **Disciplina:** Desenvolvimento de Software I
- **Linguagem:** Java
- **Tema:** Controle de Empréstimos de Livros

## Descrição do Sistema

O Controle de Empréstimos de Livros é um sistema desenvolvido em Java para auxiliar na organização de uma biblioteca escolar.

O programa permite cadastrar livros, consultar informações, controlar os empréstimos realizados pelos alunos e registrar as devoluções.

O sistema funciona por meio de um menu interativo no console, permitindo que o usuário escolha as operações desejadas.

Os dados ficam armazenados na memória durante a execução do programa.

## Funcionalidades Implementadas

1. Cadastrar um livro.
2. Listar todos os livros e suas situações.
3. Buscar um livro pelo código.
4. Registrar empréstimo de um livro.
5. Registrar devolução de um livro.
6. Exibir a quantidade de livros disponíveis e emprestados.
7. Encerrar o programa.

## Regras de Funcionamento

- Cada cadastro representa um exemplar de livro.
- Não é permitido cadastrar dois livros com o mesmo código.
- O título e o autor não podem ficar vazios.
- Todo livro começa com a situação disponível.
- Não é permitido emprestar um livro que já esteja emprestado.
- O empréstimo exige o nome do aluno.
- Não é permitido devolver um livro que já esteja disponível.
- Ao realizar uma devolução, o livro volta a ficar disponível e o nome do aluno é apagado.
- O sistema informa quando um livro não é encontrado.

## Tecnologias e Recursos Utilizados

- Java.
- IntelliJ IDEA.
- Scanner para entrada de dados.
- ArrayList para armazenamento dos livros.
- Classes e objetos.
- Estruturas condicionais (if/else e switch).
- Estruturas de repetição (for, while e do-while).
- Métodos para organização do código.

## Organização dos Arquivos

- **Livro.java:** representa os livros e armazena seus dados.
- **Biblioteca.java:** controla os cadastros, buscas, empréstimos, devoluções e quantidades.
- **Main.java:** apresenta o menu principal e recebe as informações digitadas pelo usuário.

## Como Executar o Projeto

1. Abra o projeto no IntelliJ IDEA.
2. Verifique se o Java está configurado corretamente.
3. Abra o arquivo `Main.java`.
4. Execute o método `main`.
5. Utilize o menu apresentado no console para acessar as funcionalidades.

## Registro dos Testes

Os testes previstos para verificar o funcionamento do sistema são:

| Teste | Resultado esperado |
|---|---|
| Cadastro válido | Livro cadastrado com sucesso. |
| Código repetido | Cadastro recusado. |
| Título vazio | Cadastro recusado. |
| Autor vazio | Cadastro recusado. |
| Busca existente | Dados do livro apresentados. |
| Busca inexistente | Mensagem de livro não encontrado. |
| Empréstimo válido | Situação alterada para emprestado. |
| Empréstimo duplicado | Operação recusada. |
| Devolução válida | Situação alterada para disponível e nome do aluno apagado. |
| Devolução de livro disponível | Operação recusada. |
| Contagem de livros | Quantidades apresentadas corretamente. |
| Lista vazia | Mensagem de nenhum livro cadastrado. |
| Opção inválida | Mensagem de opção inválida. |
| Entrada não numérica | Solicitação de uma entrada numérica. |

## Armazenamento dos Dados

Os livros são armazenados utilizando ArrayList. As informações permanecem disponíveis somente enquanto o programa estiver em execução.

Não foi implementado banco de dados ou armazenamento permanente em arquivos, pois não fazem parte dos requisitos da atividade.

## Utilização de Inteligência Artificial

Foi utilizada uma ferramenta de inteligência artificial como apoio durante o desenvolvimento do projeto, auxiliando na organização do README, compilação no Github e elaboração dos testes.

## Considerações Finais

O desenvolvimento deste projeto permitiu aplicar conhecimentos de programação Java, como classes, objetos, métodos, listas, estruturas condicionais, estruturas de repetição e validação de dados.

O sistema busca facilitar o controle dos livros de uma biblioteca escolar, tornando o gerenciamento de empréstimos e devoluções mais organizado.
