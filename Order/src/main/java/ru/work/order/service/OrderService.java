package ru.work.order.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.work.order.model.Order;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {
    private KafkaTemplate<Integer, Order> kafkaTemplate;

    public Boolean save(Order order) {
        kafkaTemplate.send("order", order);
        return true;
    }

    public List<Order> findAll() {

        List<Order> rsl = new ArrayList<>();
        return rsl;
    }
}
