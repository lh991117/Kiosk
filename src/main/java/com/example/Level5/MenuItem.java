package com.example.Level5;

public class MenuItem {
    /*MeunItem 필드
    private를 통해 필드에 접근하지 못하게 제작
    */
    private String foodName;
    private double foodPrice;
    private String foodInfo;

    /*매개변수를 지닌 MenuItem 생성자
    생성자를 호출하여 각 MenuItem 필드에 값을 저장한다.*/
    public MenuItem(String foodName, double foodPrice, String foodInfo) {
        setFoodName(foodName);
        setFoodPrice(foodPrice);
        setFoodInfo(foodInfo);
    }

    //필드에 접근하는 get, set 메서드
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
