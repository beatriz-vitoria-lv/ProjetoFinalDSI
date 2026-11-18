import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;


    public Biblioteca() {
        livros = new ArrayList<>();
    }

    //Cadastrar livro
    public void cadastrarLivro(int codigo, String titulo, String autor) {

        if (buscarLivro(codigo) != null) {
            System.out.println("Erro: já existe um livro com esse código.");
            return;
        }

        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Erro: o título não pode ficar vazio.");
            return;
        }

        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("Erro: o autor não pode ficar vazio.");
            return;
        }

        Livro novoLivro = new Livro(codigo, titulo, autor);

        livros.add(novoLivro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    // Listar livro
    public void listarLivros() {

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            livro.exibirDados();
        }
    }

    // Buscar livro
    public Livro buscarLivro(int codigo) {

        for (Livro livro : livros) {

            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }

        return null;
    }

    // Registrar empréstimo
    public void registrarEmprestimo(int codigo, String nomeAluno) {

        Livro livro = buscarLivro(codigo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Esse livro já está emprestado.");
            return;
        }

        if (nomeAluno == null || nomeAluno.trim().isEmpty()) {
            System.out.println("Erro: informe o nome do aluno.");
            return;
        }

        livro.emprestar(nomeAluno);

        System.out.println("Empréstimo realizado com sucesso!");
    }

    // Registrar devolução
    public void registrarDevolucao(int codigo) {

        Livro livro = buscarLivro(codigo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("Esse livro já está disponível.");
            return;
        }

        livro.devolver();

        System.out.println("Devolução realizada com sucesso!");
    }

    // Exibir quantidade de livros
    public void exibirQuantidade() {

        int disponiveis = 0;
        int emprestados = 0;

        for (Livro livro : livros) {

            if (livro.isEmprestado()) {
                emprestados++;
            } else {
                disponiveis++;
            }
        }

        System.out.println("===== QUANTIDADE DE LIVROS =====");
        System.out.println("Livros disponíveis: " + disponiveis);
        System.out.println("Livros emprestados: " + emprestados);
        System.out.println("Total de livros: " + livros.size());
    }
}