package com.example.Level3;

import java.util.*;

public class Kiosk {
    //menuItemList 리스트를 생성한다.
    ArrayList<MenuItem> menuItemList=new ArrayList<>();

    //menuItemList 리스트에 메뉴를 저장하는 메서드
    public void menuAdd(){
        menuItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    //키오스크를 실행하는 메서드
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

            /*향상된 for문을 이용하여 menuItemList 리스트 안의 내용을 출력
            menuItem 클래스 안의 필드에 직접 접근한다.*/
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

                //0을 입력한 경우에 프로그램을 종료
                if(checkNum==0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                //메뉴에 있는 숫자 외에 다른 숫자를 입력한 경우 오류 메세지 출력
                else if(checkNum>menuItemList.size()){
                    System.out.println("메뉴에 있는 숫자만 입력해주세요!");
                }
                else{
                    System.out.println("선택한 메뉴 : "+menuItemList.get(checkNum-1).foodName+", "+menuItemList.get(checkNum-1).foodPrice+", "+menuItemList.get(checkNum-1).foodInfo);
                }
            }catch (Exception e){//숫자 외에 문자가 오는 경우 예외 처리
                sc.nextLine();
                System.out.println("숫자만 입력하실 수 있습니다!");
            }
        }
    }
}
