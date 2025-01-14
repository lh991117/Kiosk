package com.example.Level3;

import java.util.*;

public class Kiosk {
    ArrayList<MenuItem> menuItemList=new ArrayList<>();

    public void menuAdd(){
        menuItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void Start(){
        int index=1;
        int checkNum;
        Scanner sc=new Scanner(System.in);

        //리스트 추가 함수 실행
        menuAdd();

        //반복문 실행
        while(true){
            index=1;
            System.out.println("[ ShakeShack Menu ]");

            for (MenuItem menuItem : menuItemList) {
                System.out.println(index+". "+menuItem.foodName+" | W "+menuItem.foodPrice+" | "+menuItem.foodInfo);
                index++;
            }

            System.out.println("0. 종료  | 종료");
            System.out.println();

            try{
                System.out.println("원하는 메뉴 번호를 입력하시거나 종료 숫자를 입력하시면 됩니다.");
                checkNum=sc.nextInt();
                sc.nextLine();
                System.out.println();

                if(checkNum==0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                else if(checkNum>menuItemList.size()){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                }
                else{
                    System.out.println("선택한 메뉴 : "+menuItemList.get(checkNum-1).foodName+", "+menuItemList.get(checkNum-1).foodPrice+", "+menuItemList.get(checkNum-1).foodInfo);
                }
            }catch (Exception e){
                sc.nextLine();
                System.out.println("숫자만 입력하실 수 있습니다!");
            }
        }
    }
}
