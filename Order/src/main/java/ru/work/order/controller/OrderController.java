package ru.work.order.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.work.order.model.Order;
import ru.work.order.service.OrderService;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/")
    public ResponseEntity<List> findAll(){
        return new ResponseEntity<List>(HttpStatus.OK);
    }
}
