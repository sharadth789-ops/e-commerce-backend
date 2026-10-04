package com.foodstore.food_store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodstore.food_store.entity.FoodUser;

public interface FoodUserRepository  extends JpaRepository<FoodUser , Long>{

    
}