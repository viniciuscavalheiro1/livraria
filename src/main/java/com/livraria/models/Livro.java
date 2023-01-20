package com.livraria.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Livro extends Produto{
    //gêneros, escritor, editora .
    private String genero;
    private String escritor;
    private String editora;
    public Livro(UUID id, String nome, BigDecimal preco, LocalDateTime createAt, LocalDateTime updateAt, String genero, String escritor, String editora) {
        super(id, nome, preco, createAt, updateAt);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ID " + getId() +
                ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Criado: " + getCreateAt() +
                ", Modificado: " + getUpdateAt() +
                ", Gênero: " + genero + '\'' +
                ", Escritor: " + escritor + '\'' +
                ", Editora: " + editora + '\'' +
                '}';
    }
}
