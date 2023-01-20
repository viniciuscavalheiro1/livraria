package com.livraria.dbvirtual;

import com.livraria.models.*;

import java.util.ArrayList;
import java.util.List;

public class DBVirtualService {
    List<AlbumMusica> albumMusicas = new ArrayList<>();
    List<Brinquedo> brinquedos = new ArrayList<>();
    List<Filme> filmes = new ArrayList<>();
    List<Jogo> jogos = new ArrayList<>();
    List<Livro> livros = new ArrayList<>();

    public List<AlbumMusica> getAlbumMusicas() {
        return albumMusicas;
    }

    public void setAlbumMusicas(AlbumMusica albumMusica) {
        this.albumMusicas.add(albumMusica);
    }

    public List<Brinquedo> getBrinquedos() {
        return brinquedos;
    }

    public void setBrinquedos(Brinquedo brinquedo) {
        this.brinquedos.add(brinquedo);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(Filme filme) {
        this.filmes.add(filme);
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Jogo jogo) {
        this.jogos.add(jogo);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Livro livro) {
        this.livros.add(livro);
    }
}
