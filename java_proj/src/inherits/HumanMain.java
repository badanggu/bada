package inherits;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {

		String jong = null;

		// 변수선언

		Scanner s = new Scanner(System.in);

		// 컬렉션중에서 arrayList

		// ArrayList<항목의타입> 변수이름 =

		// new ArrayList<항목의타입>();

		ArrayList<Human> humans = new ArrayList<Human>();



		do {



		System.out.println("== 메뉴를 선택하세요! == ");

		System.out.println("0.나가기");

		System.out.println("1.야구선수");

		System.out.println("2.축구선수");

		System.out.println("3.목록");

		System.out.print("선택 : ");

		jong = s.nextLine();

		//


		Human human = null;

		// 야구선수 등록인 경우

		if (jong.equals("1")) { //1번 숫자를 누르면

		System.out.println();

		System.out.println("-- 야구선수 등록 --");

		// humans.add(항목의값)

		System.out.print("이름 : ");

		human = new Human(new BaseballPlayer(s.nextLine())); 

		System.out.println("-- 야구선수 등록완료! --");

		System.out.println();

		// 축구선수 등록인 경우 

		} else if (jong.equals("2")) {

		System.out.println();

		System.out.println("-- 축구선수 등록 --");

		System.out.print("이름 : ");

		// humans.add(항목의값)

		human = new Human(new FootballPlayer(s.nextLine()));

		System.out.println();

		System.out.println("-- 축구선수 등록완료! --");

		// 운동선수 목록인 경우 

		} else if (jong.equals("3")) {

		System.out.println("-- 선수들 목록 --");

		for (Human man : humans) {

		man.play();

		}

		System.out.println("-- 목록완료! --");

		}

		// 나가기

		else {

		jong = "0";

		}

		// 휴먼에 넣기

		humans.add(human); 


		} while (!jong.equals("0"));


		System.out.println("\n=================================");

		System.out.println("==== 프로그램을 종료합니다. =====");

		System.out.println("=================================\n");

		
		}

		}


		