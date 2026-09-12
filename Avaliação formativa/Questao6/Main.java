public class Main {
    public static void main(String[] args) {
        // 1. Criação do objeto
        Aluno aluno = new Aluno("Ana Souza", "20260001", "Ciência da Computação");

        System.out.println("--- Dados iniciais ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println();

        
        System.out.println("Alterando o curso");
        aluno.setCurso("Sistemas de Informação");
        System.out.println();

        System.out.println("Tentando alterar o nome para vazio");
        aluno.setNome("");
        System.out.println();

        System.out.println("--- Dados finais ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
    }
}