package bapi;

import java.util.Scanner;

public class StringExe {

	public static void main(String[] args) {
		/*
		 * 프로그램 시작되면 다음과 같이 출력
		 *  다섯문자를 입력하고 엔터를 치시오.(예> 방탄소년단) : 방탄소년단
		 *  첫자:안
		 *  둘째:
		 *  
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("다섯문자를 입력하고 엔터");
		String a= sc.nextLine();
		String[]fives= {"첫","두","세","네","다섯"};
		for (int i = 0; i < a.length(); i++) {
			System.out.printf("%s번째 글자:%s \n",fives[i],a.charAt(i));
				
		}
		
	}

}
