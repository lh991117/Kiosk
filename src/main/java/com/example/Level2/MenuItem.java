package com.example.Level2;

public class MenuItem {
    //MeunItem 필드
    String foodName;
    double foodPrice;
    String foodInfo;

    /*매개변수를 지닌 MenuItem 생성자
    생성자를 호출하여 각 MenuItem 필드에 값을 저장한다.*/
    public MenuItem(String foodName, double foodPrice, String foodInfo) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodInfo = foodInfo;
    }
}
