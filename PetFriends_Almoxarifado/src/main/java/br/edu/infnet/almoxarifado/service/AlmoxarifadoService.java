package br.edu.infnet.almoxarifado.service;

import br.edu.infnet.almoxarifado.domain.Pedido;
import org.springframework.stereotype.Service;

@Service
public class AlmoxarifadoService {

    public Pedido processarPedido(Pedido pedido) {
        pedido.setStatus("Processado no Almoxarifado");
        return pedido;
    }
}
