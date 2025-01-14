package com.example.Level5;

public class MenuItem {
    //MeunItem 필드
    private String foodName;
    private double foodPrice;
    private String foodInfo;

    public MenuItem(String foodName, double foodPrice, String foodInfo) {
        setFoodName(foodName);
        setFoodPrice(foodPrice);
        setFoodInfo(foodInfo);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }
}
