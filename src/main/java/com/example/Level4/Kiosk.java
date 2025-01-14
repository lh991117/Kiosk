package com.example.Level4;

import java.util.*;

public class Kiosk {
    Menu menu=new Menu();

    public void Start(){
        int checkNum;
        Scanner sc=new Scanner(System.in);

        //리스트 추가 함수 실행
        menu.addMenu();

        //반복문 실행
        while(true){
            System.out.println("[ ShakeShack Menu ]");

            //Menu 클래스에서 리스트에 메뉴를 추가하는 함수를 불러와 실행
            menu.enumList();

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
                else if(checkNum>menu.menuItemList.size()-1){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                }
                else{
                    menu.getList(checkNum);
                }
            }catch (Exception e){
                sc.nextLine();
                System.out.println("숫자만 입력하실 수 있습니다!");
            }
        }
    }
}
