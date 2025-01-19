package com.example.Level7;

public enum Discount {
    PNM("국가유공자",0.1),
    SOLDIER("군인",0.05),
    STUDENT("학생",0.03),
    PEOPLE("일반",0);

    private String dType;
    private double discount;

    Discount(String dType, double discount) {
        this.dType = dType;
        this.discount = discount;
    }

    public String getDType() {
        return dType;
    }

    public double getDiscount() {
        return discount;
    }
}
