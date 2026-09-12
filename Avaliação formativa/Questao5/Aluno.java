public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}