package ru.work.store.service;

import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.work.store.model.Order;
import ru.work.store.repository.StoreRepository;


@Service
@AllArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

     @KafkaListener(topics = "order", groupId = "app.1")
    public void acceptOrder(Order order) {
        storeRepository.save(order);
    }
}
