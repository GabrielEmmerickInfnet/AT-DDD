package br.edu.infnet.almoxarifado.domain;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private String nome;
    private int quantidade;
    private BigDecimal preco;


    
    public Produto() {}

    public Produto(Long id, String nome, int quantidade, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
