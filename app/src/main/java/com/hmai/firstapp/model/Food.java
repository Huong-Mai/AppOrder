package com.hmai.firstapp.model;

public class Food {
    private String idFood;
    private String foodName;
    private String price;
    private String image;

    public Food() {
    }

    public Food(String foodName, String price, String image) {
        this.foodName = foodName;
        this.price = price;
        this.image = image;
    }

    public Food(String idFood, String foodName, String price, String image) {
        this.idFood = idFood;
        this.foodName = foodName;
        this.price = price;
        this.image = image;
    }

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
