package ru.work.order.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.work.order.model.Order;
import org.springframework.kafka.core.KafkaTemplate;

@Service
@AllArgsConstructor
public class OrderService {
    private KafkaTemplate<Integer, Order> kafkaTemplate;

    public Boolean save(Order order) {
        kafkaTemplate.send("order", order);
        return true;
    }
}
