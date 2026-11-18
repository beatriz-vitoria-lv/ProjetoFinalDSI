public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private boolean emprestado;
    private String nomeAluno;


    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        this.nomeAluno = "";
    }

    // Métodos para consultar os dados
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    // Registrar empréstimo
    public void emprestar(String nomeAluno) {
        this.emprestado = true;
        this.nomeAluno = nomeAluno;
    }

    // Registrar devolução
    public void devolver() {
        this.emprestado = false;
        this.nomeAluno = "";
    }

    // Exibir informações do livro
    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);

        if (emprestado) {
            System.out.println("Situação: Emprestado");
            System.out.println("Aluno: " + nomeAluno);
        } else {
            System.out.println("Situação: Disponível");
        }

        System.out.println("---------------------------");
    }
}