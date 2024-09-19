package ru.work.order.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.work.order.model.Order;
import ru.work.order.service.OrderService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        orderService.save(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
