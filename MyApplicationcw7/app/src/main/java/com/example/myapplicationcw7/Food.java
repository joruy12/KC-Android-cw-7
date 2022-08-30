package com.example.myapplicationcw7;

public class Food {
    private String foodName;
    private int foodPrice;
    private int foodImage;

    public Food(String foodName, int foodPrice, int foodImage) {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public Food() {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodImage = foodImage;
    }

}
