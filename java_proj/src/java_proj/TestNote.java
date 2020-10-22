package java_proj;

import java.util.Objects;
import java.util.Scanner;

public class TestNote {

	public static void main(String[] args) {
		// 테스트
		//System.out.println(6);
		//시작
		System.out.println("== TEST START! ===");
		System.out.println("이것은 경상북도 칠곡군 선봉사에 있는 비석입니다.\n"
				+ "문종의 아들인 그가 국청사를 중심으로\t 천태종을 개창한 행적이 기록되어 있습니다.\n 그에 대한 설명으로 옳은 것은?");
		//컴파일 및 콘솔에서 실행 Ctrl+ f11
		Scanner s =new Scanner(System.in);
		//
		
		
		String strM = "0";//나가기
		//do~while :한번은 실행되는 반복문
		
		do {
			System.out.println("1.보현십원가를 지어 불교 교리를 전파하였다");
			System.out.println("2.불교 개혁을 주장하며 수선사 결사를 조직하였다");
			System.out.println("3.선문염송집을 편찬하고 유불 일치설을 주장하였다");
			System.out.println("4.불교 관련 설화를 중심으로 삼국유사를 저술하였다");
			System.out.println("5.이론 연마와 수행을 함께 강조하는 교관겸수를 제시하였다");
			System.out.print("선택:");
			//메뉴선택하게한다 - 
			strM =s.nextLine();
			
			switch (strM) {
			case "1":			
				System.out.println("1.보현십원가를 지어 불교 교리를 전파하였다(오답입니다)");
				System.out.println("오답노트:.보현십원가는 -----이 지었다\n");
				
				break;
				
			case "2":
			
				System.out.println("오답입니다");
				System.out.println("오답노트:수선사 결사는 ***이 조직하였다\n");
									
				break;
				
			case "3":
				
				System.out.println("오답입니다");
				System.out.println("오답노트:\n");
									
				break;
				
			case "4":
				
				System.out.println("오답입니다");
				System.out.println("오답노트:\n");
									
				break;
				
			case "5":
				System.out.println("==5.정답==");			
				break;
			default:
				break;
			}
		} while (!strM.equals("5"));
		//종료 ---0이 아닐땐 계속 돈다 (느낌표 =not)
		System.out.println("== PROGRAM END! ===");
		

	}

}
