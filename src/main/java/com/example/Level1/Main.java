package com.example.Level1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2차원 배열을 통한 햄버거 메뉴 저장
        String[][] menuItem={
                {"ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"},
                {"SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"},
                {"Cheeseburger", "6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"},
                {"Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거"}
        };
        int checkNum;
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("[ ShakeShack Menu ]");
            //menuItem 2차원 배열에 저장된 햄버거들을 출력
            for(int i=0; i<menuItem.length; i++){
                System.out.println((i+1)+". "+menuItem[i][0]+"| W "+menuItem[i][1]+" | "+menuItem[i][2]);
            }
            System.out.println("0. 종료  | 종료");
            checkNum=sc.nextInt();
            System.out.println();

            if(checkNum==0){//0이 입력된 경우에 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
