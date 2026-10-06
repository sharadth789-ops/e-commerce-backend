package com.foodstore.food_store.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodstore.food_store.entity.FoodUser;

public interface FoodUserRepository  extends JpaRepository<FoodUser , Long>{

       List<FoodUser> findByUserId(Long userId);
}