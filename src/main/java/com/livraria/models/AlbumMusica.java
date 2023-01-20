package com.livraria.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class AlbumMusica extends Produto {

    private String musicoBanda;
    private String genero;
    private String selo;

    public AlbumMusica(UUID id, String nome, BigDecimal preco, LocalDateTime createAt, LocalDateTime updateAt, String musicoBanda, String genero, String selo) {
        super(id, nome, preco, createAt, updateAt);
        this.musicoBanda = musicoBanda;
        this.genero = genero;
        this.selo = selo;
    }

    public String getMusicoBanda() {
        return musicoBanda;
    }

    public void setMusicoBanda(String musicoBanda) {
        this.musicoBanda = musicoBanda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    @Override
    public String toString() {
        return "AlbumMusica{" +
                "ID " + getId() +
                ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Criado: " + getCreateAt() +
                ", Modificado: " + getUpdateAt() +
                ", musicoBanda: " + musicoBanda + '\'' +
                ", genero: " + genero + '\'' +
                ", selo: " + selo + '\'' +
                '}';
    }
}
