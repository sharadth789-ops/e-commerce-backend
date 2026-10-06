package com.foodstore.food_store.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodstore.food_store.Service.FoodUserService;
import com.foodstore.food_store.entity.FoodUser;

@RestController
public class FoodUserController {

    private final FoodUserService foodUserService;

    public FoodUserController(FoodUserService foodUserService) {
        this.foodUserService = foodUserService;
    }

    @PostMapping("/order")
    public FoodUser postMethodName(@RequestBody FoodUser foodUser) {

        foodUser.setUserId(1L);

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