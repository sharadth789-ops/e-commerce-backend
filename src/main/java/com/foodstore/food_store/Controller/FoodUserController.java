package com.foodstore.food_store.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.foodstore.food_store.Service.FoodUserService;
import com.foodstore.food_store.entity.FoodUser;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController

public class FoodUserController {

    private final FoodUserService foodUserService;

    public FoodUserController(FoodUserService foodUserService) {
        this.foodUserService = foodUserService;
    }

@PostMapping("/order")
public FoodUser postMethodName(@RequestBody FoodUser foodUser) {
    return foodUserService.saveUser(foodUser);
}

@GetMapping("/orders/{userId}")
public List<FoodUser> getUserOrders(@PathVariable Long userId) {
    return foodUserService.getOrdersByUserId(userId);
}

@GetMapping("/orders")
public List<FoodUser> getAllOrders() {
    return foodUserService.getAllOrders();
}

@DeleteMapping("/orders/{id}")
public void deleteOrder(@PathVariable Long id) {
    foodUserService.deleteOrder(id);
}

}