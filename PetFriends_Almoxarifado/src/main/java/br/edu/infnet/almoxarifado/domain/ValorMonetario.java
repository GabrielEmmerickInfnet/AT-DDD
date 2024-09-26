package br.edu.infnet.almoxarifado.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class ValorMonetario {
    private BigDecimal valor;

   
    public ValorMonetario(BigDecimal valor) {
        this.valor = valor;
    }

  
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValorMonetario that = (ValorMonetario) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
    
    @Override
    public String toString() {
        return "R$ " + valor;
    }
}
