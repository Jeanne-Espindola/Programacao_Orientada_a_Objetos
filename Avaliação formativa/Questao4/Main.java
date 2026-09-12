import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double somaNotas = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int aprovados = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = entrada.nextDouble();
            somaNotas += notas[i];

            if (i == 0) {
                maiorNota = notas[i];
                menorNota = notas[i];
            } else {
                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                }
                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }
            }

            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = somaNotas / 5;

        System.out.println("\n--- Resultado ---");
        System.out.print("Notas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Estudantes com nota >= 7.0: " + aprovados);

        entrada.close();
    }
}