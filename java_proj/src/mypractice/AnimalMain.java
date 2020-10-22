package mypractice;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
	
		public static void main(String[] args) {
			
			Thread thread= new Thread(new Runnable() {
				@Override
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();
					for (int i = 0; i <10; i++) {
						toolkit.beep();
						try {Thread.sleep(800);} catch (Exception e) {	}
						
					}
				}
			});
			
	thread.start();
	for (int i = 0; i < 10; i++) {
		System.out.println(i+1);
		try {Thread.sleep(800);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			

	
				String jong = null;

				// 변수선언

				Scanner s = new Scanner(System.in);

				// 컬렉션중에서 arrayList

				// ArrayList<항목의타입> 변수이름 =

				// new ArrayList<항목의타입>();

				ArrayList<Animal> animals = new ArrayList<Animal>();



				do {



				System.out.println("==대화의 이 '나라'에 대한 설명으로 옳은 것은? == ");
				System.out.println("A:솟대는 '이 나라'의 소도에서 유래했다고 해!\r\n" + 
						"B:'이 나라'에는 제사장인 천군도 있었어! ");


				

				System.out.println("1.범금 8조로 백성을 다스렸다");

				System.out.println("2.영고라는 제천 행사를 열었다");

				System.out.println("3.서옥제라는 혼인 풍습이 있었다");
				
				System.out.println("4.신지,읍차 등의 지배자가 있었다");
				System.out.println("0.다른문제풀기");

				System.out.print("선택 : ");

				jong = s.nextLine();

				//


				Animal animal = null;

				// 야구선수 등록인 경우

				if (jong.equals("1")) { //1번 숫자를 누르면

				System.out.println();

				System.out.println("오답입니다");

				// humans.add(항목의값)

				System.out.print("오답노트: ");

				animal = new Animal (new Fish(s.nextLine())); 

				System.out.println("--오답 등록완료! --");

				System.out.println();

				// 축구선수 등록인 경우 

				} else if (jong.equals("2")) {

				System.out.println();

				System.out.println("오답입니다");

				// humans.add(항목의값)

				System.out.print("오답노트: ");
				// humans.add(항목의값)

				animal = new Animal(new Bird(s.nextLine()));

				System.out.println();

				System.out.println("-- 오답 등록완료! --");

				// 운동선수 목록인 경우 

				} 
				
				else if (jong.equals("3")) {

					System.out.println();

					System.out.println("오답입니다");

					// humans.add(항목의값)

					System.out.print("오답노트: ");
					// humans.add(항목의값)

					animal = new Animal(new Bird(s.nextLine()));

					System.out.println();

					System.out.println("-- 등록완료! --");

					// 운동선수 목록인 경우 

					}
				
				else if (jong.equals("4")) {

					
				System.out.println("-- 정답입니다! --");
				System.out.println("-- 오답정리내용 --");

				for (Animal man : animals) {

				man.play();

				}

				System.out.println("-- 오답체크 --");
				break;
				}

				// 나가기

				else {

				jong = "0";

				}

				// 휴먼에 넣기

				animals.add(animal); 


				} while (!jong.equals("0"));


				System.out.println("\n=================================");

				System.out.println("==== 다른문제 풀기 =====");

				System.out.println("=================================\n");

				
				}

				


				
		

	
		}
}

