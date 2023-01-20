package com.livraria.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Jogo extends Produto{
    private String distribuidora;
    private String Genero;
    private String estudio;

    public Jogo(UUID id, String nome, BigDecimal preco, LocalDateTime createAt, LocalDateTime updateAt, String distribuidora, String genero, String estudio) {
        super(id, nome, preco, createAt, updateAt);
        this.distribuidora = distribuidora;
        Genero = genero;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "ID " + getId() +
                ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Criado: " + getCreateAt() +
                ", Modificado: " + getUpdateAt() +
                ", distribuidora: " + distribuidora + '\'' +
                ", Genero: " + Genero + '\'' +
                ", estudio: " + estudio + '\'' +
                '}';
    }
}
