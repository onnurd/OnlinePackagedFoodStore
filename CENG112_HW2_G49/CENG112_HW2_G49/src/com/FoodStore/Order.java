package com.FoodStore;

import java.util.Arrays;

public class Order {

    private int ID;
    private Date orderDate;
    private String[] foodCategories;

    public Order(int ID, Date orderDate, String[] foodCategories) {
        this.ID = ID;
        this.orderDate = orderDate;
        this.foodCategories = foodCategories;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String[] getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(String[] foodCategories) {
        this.foodCategories = foodCategories;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", orderDate=" + orderDate +
                ", foodCategories=" + Arrays.toString(foodCategories) +
                '}';
    }
}
