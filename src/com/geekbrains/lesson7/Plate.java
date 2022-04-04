package com.geekbrains.lesson7;

public class Plate {

    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void decreaseFood(int appetite) {
        this.foodQuantity -= appetite;
    }

    public boolean isFoodEnough(int appetite) {
        return this.foodQuantity >= appetite;
    }

    public void addFood(int foodQuantity) {
        this.foodQuantity += foodQuantity;
    }
}
