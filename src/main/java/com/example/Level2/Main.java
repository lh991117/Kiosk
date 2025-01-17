package com.example.Level2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //menuItem 리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();
        int index=1;
        int checkNum;
        Scanner sc=new Scanner(System.in);

        //menuItem 리스트에 MenuItem 생성자를 통해서 값을 저장
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while(true){
            index=1;
            System.out.println("[ ShakeShack Menu ]");

            /*향상된 for문을 이용하여 menuItem 리스트 안의 내용을 출력
            menuItem 클래스 안의 필드에 직접 접근한다.*/
            for (MenuItem menuItem : menuItems) {
                System.out.println(index+". "+menuItem.foodName+" | W "+menuItem.foodPrice+" | "+menuItem.foodInfo);
                index++;
            }

            System.out.println("0. 종료  | 종료");
            System.out.println();

            System.out.println("원하는 메뉴 번호를 입력하시거나 종료 숫자를 입력하시면 됩니다.");
            checkNum=sc.nextInt();
            System.out.println();

            if(checkNum==0){//0을 입력한 경우에 프로그램을 종료한다.
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{//원하는 메뉴 번호를 입력한 경우 해당 메뉴의 정보를 출력한다.
                System.out.println("선택한 메뉴 : "+menuItems.get(checkNum-1).foodName+", "+menuItems.get(checkNum-1).foodPrice+", "+menuItems.get(checkNum-1).foodInfo);
            }
        }
    }
}
