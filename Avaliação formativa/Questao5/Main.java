public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana Souza", 20260001, "Ciência da Computação");
        Aluno aluno2 = new Aluno("Pedro Lima", 20260002, "Engenharia da Computação");

        System.out.println("--- Aluno 1 ---");
        aluno1.exibirDados();

        System.out.println("\n--- Aluno 2 ---");
        aluno2.exibirDados();
    }
}