package avaliacao_formativaIII.service;

import java.util.ArrayList;

import avaliacao_formativaIII.model.Livro;
import avaliacao_formativaIII.model.LivroNaoEncontradoException;

public class BibliotecaService {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrar(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    public void listar() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public Livro buscarPorCodigo(int codigo) throws LivroNaoEncontradoException {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        throw new LivroNaoEncontradoException("Livro com código " + codigo + " não encontrado.");
    }

    public void emprestar(int codigo) throws LivroNaoEncontradoException {
        Livro livro = buscarPorCodigo(codigo);
        if (livro.emprestar()) {
            System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' já está emprestado.");
        }
    }

    public void devolver(int codigo) throws LivroNaoEncontradoException {
        Livro livro = buscarPorCodigo(codigo);
        if (livro.devolver()) {
            System.out.println("Livro devolvido com sucesso: " + livro.getTitulo());
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não estava emprestado.");
        }
    }
}
