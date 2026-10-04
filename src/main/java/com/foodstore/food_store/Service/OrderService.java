package com.foodstore.food_store.Service;

import org.springframework.stereotype.Service;

import com.foodstore.food_store.Repository.OrderRepository;
import com.foodstore.food_store.entity.Order;

@Service

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
          return orderRepository.save(order);
    }
}