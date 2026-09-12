import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        String nome;
        String curso;
        int idade;

        Scanner entrada = new Scanner(System.in);




        System.out.print("\nDigite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("\nDigite seu curso: ");
        curso = entrada.nextLine();
        System.out.print("\nDigite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("\nNome: " + nome);
        System.out.print("\nIdade: " + idade);
        System.out.print("\nCurso: " + curso + "\n");
        System.out.printf("--- DADOS DO ESTUDANTE ---");
        System.out.print("\nNome: " + nome);
        System.out.print("\nIdade: " + idade);
        System.out.print("\nCurso: " + curso);




    }
}