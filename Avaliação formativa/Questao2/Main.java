import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota;
        int qtdEstudantes;
        float media;
        float somaNotas = 0;
        int qtdAprovado = 0;
        float maior_nota = 0.0f;
        float menor_nota = 10.0f;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de estudantes: ");
        qtdEstudantes = entrada.nextInt();

        for (int i = 0; i < qtdEstudantes; i++) {
            System.out.printf("Nota do estudante %d: ", i + 1);
            nota = entrada.nextFloat();
            somaNotas += nota;

            if (nota > maior_nota) {
                maior_nota = nota;
            }
            if (nota < menor_nota) {
                menor_nota = nota;
            }
            if (nota >= 7.0f) {
                qtdAprovado += 1;
            }
        }

        media = somaNotas / qtdEstudantes;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Média da turma: %.2f%n", media);
        System.out.printf("Maior nota: %.1f%n", maior_nota);
        System.out.printf("Menor nota: %.1f%n", menor_nota);
        System.out.printf("Estudantes aprovados: %d%n", qtdAprovado);

        entrada.close();
    }
}