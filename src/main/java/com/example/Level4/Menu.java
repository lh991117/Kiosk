package com.example.Level4;

import java.util.*;

public class Menu {
    /*ArrayList 필드
    각 음식 카테고리마다 리스트를 생성한다.*/
    ArrayList<String> Category=new ArrayList<>();
    ArrayList<MenuItem> burgerItemList =new ArrayList<>();
    ArrayList<MenuItem> drinkItemList =new ArrayList<>();
    ArrayList<MenuItem> dessertItemList =new ArrayList<>();

    //카테고리 리스트에 카테고리 추가
    public void addCategory(){
        Category.add("Burgers");
        Category.add("Drinks");
        Category.add("Desserts");
    }
    //카테고리 리스트를 열거하는 함수
    public void categoryList(){
        int index=1;
        System.out.println("[ Main Menu ]");
        for(String s : Category){
            System.out.println(index+". "+s);
            index++;
        }
        System.out.println("0. 종료  | 종료");
    }

    //버거리스트에 버거를 추가
    public void addBurgerMenu(){
        burgerItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
    //버거리스트를 열거하는 함수
    public void enumBurgerList(){
        int index=1;
        System.out.println("[ Burgers Menu ]");
        for (MenuItem menuItem : burgerItemList) {
            System.out.println(index+". "+menuItem.foodName+" | W "+menuItem.foodPrice+" | "+menuItem.foodInfo);
            index++;
        }
        System.out.println("0. 뒤로가기");
    }

    //음료 리스트에 음료를 추가
    public void addDrinkMenu(){
        drinkItemList.add(new MenuItem("Coke", 1.5, "얼음이 들어간 콜라"));
        drinkItemList.add(new MenuItem("Sprite", 1.5, "스프라이트사 제품의 사이다"));
    }
    //음료리스트를 열거하는 함수
    public void enumDrinkList(){
        int index=1;
        System.out.println("[ Drinks Menu ]");
        for (MenuItem menuItem : drinkItemList) {
            System.out.println(index+". "+menuItem.foodName+" | W "+menuItem.foodPrice+" | "+menuItem.foodInfo);
            index++;
        }
        System.out.println("0. 뒤로가기");
    }

    //디저트 리스트에 디저트를 추가
    public void addDessertMenu(){
        dessertItemList.add(new MenuItem("Choko IceCream", 2.0, "초코맛 소프트 아이스크림"));
        dessertItemList.add(new MenuItem("Banila IceCream", 2.0, "바닐라맛 소프트 아이스크림"));
        dessertItemList.add(new MenuItem("Mint IceCream", 2.0, "민트맛 소프트 아이스크림"));
    }
    //디저트리스트를 열거하는 함수
    public void enumDessertList(){
        int index=1;
        System.out.println("[ Desserts Menu ]");
        for (MenuItem menuItem : dessertItemList) {
            System.out.println(index+". "+menuItem.foodName+" | W "+menuItem.foodPrice+" | "+menuItem.foodInfo);
            index++;
        }
        System.out.println("0. 뒤로가기");
    }

    //선택한 카테고리로 이동하는 함수
    public void getCategoryList(int checkNum){
        switch (checkNum){
            case 1:
                enumBurgerList();
                break;
            case 2:
                enumDrinkList();
                break;
            case 3:
                enumDessertList();
                break;
            default:
        }
    }

    //보고 싶은 메뉴 번호와 해당 메뉴에서 선택한 숫자를 입력 받아 실행하는 메서드
    public void getMenuList(int checkNum, int orderNum){
        switch (checkNum){
            case 1:
                if(orderNum<=burgerItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ burgerItemList.get(orderNum-1).foodName+", "+ burgerItemList.get(orderNum-1).foodPrice+", "+ burgerItemList.get(orderNum-1).foodInfo);
                    System.out.println();
                }
                else if(orderNum>burgerItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            case 2:
                if(orderNum<=drinkItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ drinkItemList.get(orderNum-1).foodName+", "+ drinkItemList.get(orderNum-1).foodPrice+", "+ drinkItemList.get(orderNum-1).foodInfo);
                    System.out.println();
                }
                else if(orderNum>drinkItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            case 3:
                if(orderNum<=dessertItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ dessertItemList.get(orderNum-1).foodName+", "+ dessertItemList.get(orderNum-1).foodPrice+", "+ dessertItemList.get(orderNum-1).foodInfo);
                    System.out.println();
                }
                else if(orderNum>dessertItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            default:
        }
    }
}
