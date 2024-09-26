package br.edu.infnet.transporte.domain;

import java.util.Objects;

public class EnderecoEntrega {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    
    public EnderecoEntrega(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoEntrega that = (EnderecoEntrega) o;
        return Objects.equals(rua, that.rua) &&
               Objects.equals(cidade, that.cidade) &&
               Objects.equals(estado, that.estado) &&
               Objects.equals(cep, that.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, cidade, estado, cep);
    }

    @Override
    public String toString() {
        return rua + ", " + cidade + ", " + estado + ", CEP: " + cep;
    }
}
