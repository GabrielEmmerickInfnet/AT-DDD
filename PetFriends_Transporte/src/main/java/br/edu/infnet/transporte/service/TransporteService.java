package br.edu.infnet.transporte.service;

import br.edu.infnet.transporte.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public class TransporteService {

    public Pedido processarEntrega(Pedido pedido) {
        pedido.setStatus("Pedido em transporte");
        System.out.println("Processando entrega para o pedido: " + pedido.getId());
        return pedido;
    }
}
