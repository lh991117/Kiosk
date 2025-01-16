package com.example.Level6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //ArrayList 필드
    private ArrayList<String> Category=new ArrayList<>();
    private ArrayList<MenuItem> burgerItemList =new ArrayList<>();
    private ArrayList<MenuItem> drinkItemList =new ArrayList<>();
    private ArrayList<MenuItem> dessertItemList =new ArrayList<>();
    private ArrayList<MenuItem> orderList =new ArrayList<>();

    private boolean orderBool=false;
    private boolean finishOrder=false;

    Scanner sc =new Scanner(System.in);

    //카테고리 리스트에 카테고리 추가
    public void addCategory(){
        Category.add("Burgers");
        Category.add("Drinks");
        Category.add("Desserts");
    }
    //카테고리 리스트를 열거하는 함수
    public void categoryList(){
        int index=1;
        System.out.println("[ MAIN MENU ]");
        for(String s : Category){
            System.out.println(index+". "+s);
            index++;
        }
        System.out.println("0. 종료  | 종료");

        //장바구니에 제품이 들어와 있는 경우 해당 코드 실행
        if(getOrderBool()){
            System.out.println();
            System.out.println(index+". Orders | 장바구니를 확인 후 주문합니다.");
            System.out.println((index+1)+". Cancel | 진행 중인 주문을 취소합니다.");
        }
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
            System.out.println(index+". "+menuItem.getFoodName()+" | W "+menuItem.getFoodPrice()+" | "+menuItem.getFoodInfo());
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
            System.out.println(index+". "+menuItem.getFoodName()+" | W "+menuItem.getFoodPrice()+" | "+menuItem.getFoodInfo());
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
            System.out.println(index+". "+menuItem.getFoodName()+" | W "+menuItem.getFoodPrice()+" | "+menuItem.getFoodInfo());
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
    //해당 메뉴에서 음식을 선택하면 주문 리스트에 저장된다.
    public void getMenuList(int checkNum, int orderNum){
        switch (checkNum){
            case 1://버거 메뉴에서 음식 선택할 때 실행할 case
                if(orderNum<=burgerItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ burgerItemList.get(orderNum-1).getFoodName()+", "+ burgerItemList.get(orderNum-1).getFoodPrice()+", "+ burgerItemList.get(orderNum-1).getFoodInfo());
                    System.out.println();

                    while(true){//올바른 숫자를 입력할 때까지 무한 반복
                        try{
                            System.out.println(burgerItemList.get(orderNum-1).getFoodName()+" | W "+burgerItemList.get(orderNum-1).getFoodPrice()+" | "+burgerItemList.get(orderNum-1).getFoodInfo());
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인  2. 취소");
                            int addNum=sc.nextInt();
                            sc.nextLine();

                            if(addNum==1){//1을 누를 경우 주문 리스트에 추가된다.
                                System.out.println();
                                System.out.println(burgerItemList.get(orderNum-1).getFoodName()+" 이 장바구니에 추가되었습니다.");
                                setOrderBool(true);
                                orderList.add(new MenuItem(burgerItemList.get(orderNum-1).getFoodName(), burgerItemList.get(orderNum-1).getFoodPrice(), burgerItemList.get(orderNum-1).getFoodInfo()));
                                System.out.println();
                                break;
                            }
                            else if(addNum==2){//2를 누를 경우 주문 리스트에 추가하지 않고 다시 메뉴로 돌아간다.
                                System.out.println();
                                break;
                            }
                            else{
                                System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                                System.out.println();
                            }
                        } catch (Exception e) {
                            sc.nextLine();
                            System.out.println("숫자만 입력하실 수 있습니다!");
                            System.out.println();
                        }
                    }
                }
                else if(orderNum>burgerItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            case 2:
                if(orderNum<=drinkItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ drinkItemList.get(orderNum-1).getFoodName()+", "+ drinkItemList.get(orderNum-1).getFoodPrice()+", "+ drinkItemList.get(orderNum-1).getFoodInfo());
                    System.out.println();

                    while(true){//올바른 숫자를 입력할 때까지 무한 반복
                        try{
                            System.out.println(drinkItemList.get(orderNum-1).getFoodName()+" | W "+drinkItemList.get(orderNum-1).getFoodPrice()+" | "+drinkItemList.get(orderNum-1).getFoodInfo());
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인  2. 취소");
                            int addNum=sc.nextInt();
                            sc.nextLine();

                            if(addNum==1){//1을 누를 경우 주문 리스트에 추가된다.
                                System.out.println();
                                System.out.println(drinkItemList.get(orderNum-1).getFoodName()+" 이 장바구니에 추가되었습니다.");
                                setOrderBool(true);
                                orderList.add(new MenuItem(drinkItemList.get(orderNum-1).getFoodName(), drinkItemList.get(orderNum-1).getFoodPrice(), drinkItemList.get(orderNum-1).getFoodInfo()));
                                System.out.println();
                                break;
                            }
                            else if(addNum==2){//2를 누를 경우 주문 리스트에 추가하지 않고 다시 메뉴로 돌아간다.
                                System.out.println();
                                break;
                            }
                            else{
                                System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                                System.out.println();
                            }
                        } catch (Exception e) {
                            sc.nextLine();
                            System.out.println("숫자만 입력하실 수 있습니다!");
                            System.out.println();
                        }
                    }
                }
                else if(orderNum>drinkItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            case 3:
                if(orderNum<=dessertItemList.size() && orderNum>0){
                    System.out.println("선택한 메뉴 : "+ dessertItemList.get(orderNum-1).getFoodName()+", "+ dessertItemList.get(orderNum-1).getFoodPrice()+", "+ dessertItemList.get(orderNum-1).getFoodInfo());
                    System.out.println();

                    while(true){//올바른 숫자를 입력할 때까지 무한 반복
                        try{
                            System.out.println(dessertItemList.get(orderNum-1).getFoodName()+" | W "+dessertItemList.get(orderNum-1).getFoodPrice()+" | "+dessertItemList.get(orderNum-1).getFoodInfo());
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인  2. 취소");
                            int addNum=sc.nextInt();
                            sc.nextLine();

                            if(addNum==1){//1을 누를 경우 주문 리스트에 추가된다.
                                System.out.println();
                                System.out.println(dessertItemList.get(orderNum-1).getFoodName()+" 이 장바구니에 추가되었습니다.");
                                setOrderBool(true);
                                orderList.add(new MenuItem(dessertItemList.get(orderNum-1).getFoodName(), dessertItemList.get(orderNum-1).getFoodPrice(), dessertItemList.get(orderNum-1).getFoodInfo()));
                                System.out.println();
                                break;
                            }
                            else if(addNum==2){//2를 누를 경우 주문 리스트에 추가하지 않고 다시 메뉴로 돌아간다.
                                System.out.println();
                                break;
                            }
                            else{
                                System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                                System.out.println();
                            }
                        } catch (Exception e) {
                            sc.nextLine();
                            System.out.println("숫자만 입력하실 수 있습니다!");
                            System.out.println();
                        }
                    }
                }
                else if(orderNum>dessertItemList.size()-1 && orderNum<0){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
                break;
            default:
        }
    }

    //카테고리 리스트의 사이즈를 주는 메서드
    public int getCategorySize(){
        return Category.size();
    }

    //주문 여부 값을 get, set 메서드로 제작
    public boolean getOrderBool(){
        return orderBool;
    }
    public void setOrderBool(Boolean orderBool){
        this.orderBool = orderBool;
    }

    //주문한 제품들 열거하고 총 금액을 계산하는 메서드
    public void enumOrderList(){
        double sum=0;
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
        for(MenuItem menuItem : orderList){
            System.out.println(menuItem.getFoodName()+" | W "+menuItem.getFoodPrice()+" | "+menuItem.getFoodInfo());
            sum+=menuItem.getFoodPrice();
        }
        System.out.println();

        System.out.println("[ Total ]");
        System.out.println("W "+sum);
        System.out.println();
        while(true){
            try{
                System.out.println("1. 주문  2. 메뉴판");
                int orderNum=sc.nextInt();
                sc.nextLine();

                if(orderNum==1){
                    System.out.println();
                    System.out.println("주문이 완료되었습니다. 금액은 W "+sum+" 입니다.");
                    setFinishOrder(true);
                    break;
                }
                else if(orderNum==2){
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                    System.out.println();
                }
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("숫자만 입력하실 수 있습니다!");
                System.out.println();
            }
        }
    }

    //주문 취소 시 주문 리스트에 저장된 값들을 제거하는 메서드
    public void clearOrderList(){
        orderList.clear();
    }

    //주문 완료 여부를 get, set메서드로 가져오기 위한 메서드
    public boolean getFinishOrder(){
        return finishOrder;
    }
    public void setFinishOrder(boolean finishOrder){
        this.finishOrder = finishOrder;
    }
}
