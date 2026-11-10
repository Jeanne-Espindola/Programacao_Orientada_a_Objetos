package avaliacao_formativaIII.model;

import avaliacao_formativaIII.interfaces.Emprestavel;

public class Livro implements Emprestavel {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public boolean emprestar() {
        if (emprestado) {
            return false;
        }
        emprestado = true;
        return true;
    }

    @Override
    public boolean devolver() {
        if (!emprestado) {
            return false;
        }
        emprestado = false;
        return true;
    }

    @Override
    public String toString() {
        String status;
        if (emprestado) {
            status = "Emprestado";
        } else {
            status = "Disponível";
        }

        String texto = "Código: " + codigo;
        texto = texto + " | Título: " + titulo;
        texto = texto + " | Autor: " + autor;
        texto = texto + " | Status: " + status;

        return texto;
    }
}