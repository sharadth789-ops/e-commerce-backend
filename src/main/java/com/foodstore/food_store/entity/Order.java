package com.foodstore.food_store.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long foodId;

    @NotNull
    @Min(1)
    private Integer quantity;

    @NotBlank
    private String address;

    @NotBlank
    private String phone;

    private String coupon;

    public Long getId() {
        return id;
    }

    public Long getFoodId() {
        return foodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }
}
