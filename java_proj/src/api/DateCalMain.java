package api;


import java.util.ArrayList;

import java.util.Date;

import java.util.Scanner;


public class DateCalMain {


public static void main(String[] args) {

// 변수

Scanner s = new Scanner(System.in);

// 접속시간..

Boolean isLogin = false;

// 접속자 이름과 접속시각관리

ArrayList<DateCal> dcs = new ArrayList<>();

String conName = null;

do {

// 접속

System.out.print("접속자이름 : ");

conName = s.nextLine();

dcs.add(new DateCal(conName, new Date()));


// 선택출력


System.out.print("접속여부(0. 종료, 1.접속) : ");
isLogin = s.nextLine().equals("1") ? true : false;



// 접속완료

System.out.println("-- 접속완료 --");



} while (isLogin);



// 접속완료

System.out.println("=== 접속종료 ===");



// 접속자 목록 출력

System.out.println(" == session List == ");


for (DateCal dc : dcs) {

dc.viewTime();

}


s.close();
}


}