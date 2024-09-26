package br.edu.infnet.transporte.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue pedidosQueue() {
        return new Queue("pedidosQueue", true);
    }
}
