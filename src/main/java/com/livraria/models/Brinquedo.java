package com.livraria.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(UUID id, String nome, BigDecimal preco, LocalDateTime createAt, LocalDateTime updateAt, String tipo) {
        super(id, nome, preco, createAt, updateAt);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "ID " + getId() +
                ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", tipo: " + tipo + '\'' +
                ", Criado: " + getCreateAt() +
                ", Modificado: " + getUpdateAt() +
                '}';
    }
}
