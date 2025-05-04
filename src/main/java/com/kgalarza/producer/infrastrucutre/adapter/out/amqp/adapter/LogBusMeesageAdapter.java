package com.kgalarza.producer.infrastrucutre.adapter.out.amqp.adapter;

import com.kgalarza.producer.domain.port.out.ILogBusMessagePort;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogBusMeesageAdapter implements ILogBusMessagePort {

    private final RabbitTemplate rabbitTemplate;

    @Value("${amqp.exchange.log}")
    private String exchange;

    @Value("${amqp.routing.key.log}")
    private String routingKey;

    public LogBusMeesageAdapter(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(exchange,
                routingKey,
                message);
    }
}
