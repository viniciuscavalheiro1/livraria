package com.livraria.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Filme extends Produto {
    private String estudio;
    private String diretores;
    private String genero;
    private String produtores;

    public Filme(UUID id, String nome, BigDecimal preco, LocalDateTime createAt, LocalDateTime updateAt, String estudio, String diretores, String genero, String produtores) {
        super(id, nome, preco, createAt, updateAt);
        this.estudio = estudio;
        this.diretores = diretores;
        this.genero = genero;
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "ID " + getId() +
                ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Criado: " + getCreateAt() +
                ", Modificado: " + getUpdateAt() +
                ", estudio: " + estudio + '\'' +
                ", diretores: " + diretores + '\'' +
                ", genero: " + genero + '\'' +
                ", produtores: " + produtores + '\'' +
                '}';
    }
}
