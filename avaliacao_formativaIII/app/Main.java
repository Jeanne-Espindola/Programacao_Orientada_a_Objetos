package avaliacao_formativaIII.app;

import java.util.Scanner;

import avaliacao_formativaIII.model.Livro;
import avaliacao_formativaIII.model.LivroNaoEncontradoException;
import avaliacao_formativaIII.service.BibliotecaService;

public class Main {
    public static void main(String[] args) {
        BibliotecaService service = new BibliotecaService();
        Scanner sc = new Scanner(System.in);

        // Livros iniciais (teste: cadastrar pelo menos três)
        service.cadastrar(new Livro(1, "Era Uma Vez um Coração Partido", "Stephanie Garber"));
        service.cadastrar(new Livro(2, "O Alienista", "Machado de Assis"));
        service.cadastrar(new Livro(3, "Caraval", "Stephanie Garber"));
        int opcao;
        do {
            System.out.println("\n BIBLIOTECA ");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro por código");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Código: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        service.cadastrar(new Livro(codigo, titulo, autor));
                        break;
                    case 2:
                        service.listar();
                        break;
                    case 3:
                        System.out.print("Código: ");
                        System.out.println(service.buscarPorCodigo(sc.nextInt()));
                        break;
                    case 4:
                        System.out.print("Código: ");
                        service.emprestar(sc.nextInt());
                        break;
                    case 5:
                        System.out.print("Código: ");
                        service.devolver(sc.nextInt());
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (LivroNaoEncontradoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);

        sc.close();
    }
}