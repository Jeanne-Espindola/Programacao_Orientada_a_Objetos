public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            System.out.println("Nome alterado com sucesso");
        } else {
            System.out.println("o nome não pode ser vazio.");
        }
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
            System.out.println("Matrícula alterada com sucesso.");
        } else {
            System.out.println("a matrícula não pode ser vazia.");
        }
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso;
            System.out.println("Curso alterado");
        } else {
            System.out.println("o curso não pode ser vazio.");
        }
    }
}