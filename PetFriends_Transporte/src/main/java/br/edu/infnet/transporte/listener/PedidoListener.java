package br.edu.infnet.transporte.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoListener {

    @RabbitListener(queues = "pedidosQueue")
    public void receiveMessage(String message) {
        System.out.println("Transporte recebeu o pedido: " + message);
        
    }
}
