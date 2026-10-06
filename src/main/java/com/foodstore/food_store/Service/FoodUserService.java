package com.foodstore.food_store.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodstore.food_store.Repository.FoodUserRepository;
import com.foodstore.food_store.entity.FoodUser;

@Service

public class FoodUserService {
    private final FoodUserRepository foodUserRepository;

    public FoodUserService(FoodUserRepository foodUserRepository) {
        this.foodUserRepository = foodUserRepository;
    }
   
    public FoodUser saveUser(FoodUser foodUser) {
    return foodUserRepository.save(foodUser);
}

public List<FoodUser> getAllOrders() {
    return foodUserRepository.findAll();
}

public List<FoodUser> getOrdersByUserId(Long userId) {
    return foodUserRepository.findByUserId(userId);
}

public void deleteOrder(Long id) {
    foodUserRepository.deleteById(id);
}
}