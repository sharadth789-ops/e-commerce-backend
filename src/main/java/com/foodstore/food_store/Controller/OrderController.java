package com.foodstore.food_store.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.foodstore.food_store.Service.OrderService;
import com.foodstore.food_store.entity.Order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }

    @PostMapping("/food")
    public Order createOrder(@RequestBody Order order) {
            return orderService.saveOrder(order);
    }
    
    @GetMapping("")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}