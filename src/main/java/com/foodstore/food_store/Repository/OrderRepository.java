package com.foodstore.food_store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodstore.food_store.entity.Order;

public interface OrderRepository  extends JpaRepository<Order , Long>{


}