import java.util.Scanner;

public class Main{



    public static int quantidadeCaracteres(String texto){
        int quantidade_letras = texto.length();
        return quantidade_letras;
    }

    public static String formatarNome(String nome){
        String maiusculo = nome.toUpperCase();
        return maiusculo;
    }

    public static boolean contemSilva(String nome){
        return nome.contains("Silva");
    }


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = entrada.nextLine();

        System.out.println("\n--- Resultado ---");
        System.out.println("Quantidade de caracteres: " + quantidadeCaracteres(nome));
        System.out.println("Nome formatado: " + formatarNome(nome));
        System.out.println("Contém Silva: " + contemSilva(nome));

entrada.close();



    }

}