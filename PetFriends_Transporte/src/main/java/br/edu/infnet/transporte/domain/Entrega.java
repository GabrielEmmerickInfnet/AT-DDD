package br.edu.infnet.transporte.domain;

import java.time.LocalDateTime;

public class Entrega {
    private Long id;
    private Long pedidoId;
    private EnderecoEntrega enderecoEntrega;
    private String statusEntrega;
    private LocalDateTime dataEntrega;

    public Entrega() {}

    public Entrega(Long id, Long pedidoId, EnderecoEntrega enderecoEntrega, String statusEntrega, LocalDateTime dataEntrega) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.enderecoEntrega = enderecoEntrega;
        this.statusEntrega = statusEntrega;
        this.dataEntrega = dataEntrega;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public EnderecoEntrega getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
