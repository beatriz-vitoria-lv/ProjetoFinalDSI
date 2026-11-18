import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {

            System.out.println("\n================================");
            System.out.println("     CONTROLE DE LIVROS");
            System.out.println("================================");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Buscar livro pelo código");
            System.out.println("4 - Registrar empréstimo");
            System.out.println("5 - Registrar devolução");
            System.out.println("6 - Exibir quantidade de livros");
            System.out.println("7 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Digite uma opção numérica!");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n=== CADASTRAR LIVRO ===");

                    System.out.print("Código: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite um código numérico!");
                        scanner.next();
                        System.out.print("Código: ");
                    }
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    biblioteca.cadastrarLivro(codigo, titulo, autor);
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE LIVROS ===");
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.println("\n=== BUSCAR LIVRO ===");

                    System.out.print("Digite o código do livro: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite um código numérico!");
                        scanner.next();
                        System.out.print("Digite o código do livro: ");
                    }

                    codigo = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = biblioteca.buscarLivro(codigo);

                    if (livro != null) {
                        livro.exibirDados();
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== REGISTRAR EMPRÉSTIMO ===");

                    System.out.print("Código do livro: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite um código numérico!");
                        scanner.next();
                        System.out.print("Código do livro: ");
                    }

                    codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();

                    biblioteca.registrarEmprestimo(codigo, nomeAluno);
                    break;

                case 5:
                    System.out.println("\n=== REGISTRAR DEVOLUÇÃO ===");

                    System.out.print("Código do livro: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite um código numérico!");
                        scanner.next();
                        System.out.print("Código do livro: ");
                    }

                    codigo = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.registrarDevolucao(codigo);
                    break;

                case 6:
                    biblioteca.exibirQuantidade();
                    break;

                case 7:
                    System.out.println("\nEncerrando o sistema...");
                    System.out.println("Obrigado por utilizar o Controle de Livros!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 7);

        scanner.close();
    }
}