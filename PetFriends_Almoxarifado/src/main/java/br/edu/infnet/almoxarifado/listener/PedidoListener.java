package br.edu.infnet.almoxarifado.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoListener {

    @RabbitListener(queues = "pedidosQueue")
    public void receiveMessage(String message) {
        System.out.println("Almoxarifado recebeu o pedido: " + message);
        
    }
}
