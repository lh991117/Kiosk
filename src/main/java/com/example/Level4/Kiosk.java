package com.example.Level4;

import java.util.*;

public class Kiosk {
    Menu menu=new Menu();

    public void Start(){
        int selectNum, orderNum;
        Scanner sc=new Scanner(System.in);

        //리스트에 필요한 내용들 추가
        menu.addCategory();
        menu.addBurgerMenu();

        //반복문 실행
        while(true){
            //카테고리 리스트 출력 함수를 불러오기
            try{
                menu.categoryList();
                selectNum=sc.nextInt();
                sc.nextLine();

                //0이 입력될 경우에는 프로그램을 종료한다.
                if(selectNum==0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                //메뉴에 있는 숫자 외에 숫자가 입력되면 메세지를 출력한다.
                else if(selectNum>menu.Category.size()-1){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                }
                else{//메뉴에 있는 숫자가 작성되면 다음 반복문이 실행된다.
                    while(true){
                        try{
                            //메뉴에 입력된 숫자에 맞는 카테고리를 불러와 열거한다.
                            menu.getCategoryList(selectNum);
                            orderNum=sc.nextInt();
                            sc.nextLine();

                            if(orderNum==0){//0이 입력될 경우에는 처음 메뉴판으로 이동된다.
                                break;
                            }
                            else{//0 이외에 숫자가 입력될 경우에 getMenuList에 숫자를 넣어서 실행한다.
                                menu.getMenuList(selectNum, orderNum);
                            }
                        } catch (Exception e) {//숫자가 아닌 문자가 입력될 경우 예외 처리
                            sc.nextLine();
                            System.out.println("숫자만 입력하실 수 있습니다!");
                        }
                    }
                }
            } catch (Exception e) {//숫자가 아닌 문자가 입력될 경우 예외 처리
                sc.nextLine();
                System.out.println("숫자만 입력하실 수 있습니다!");
            }
        }
    }
}
