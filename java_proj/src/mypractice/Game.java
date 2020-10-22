package mypractice;

import java.util.ArrayList;

import java.util.Scanner;

public class Game{ 

	public static void main(String[] args) {

/* 변수선언 */

int min=0,max=0;

ArrayList<Integer> rndNums = new ArrayList<>();

// 난수 발생

for (int i = 0; i < 10; i++) {

rndNums.add((int)Math.floor(Math.random()*100));

}

// 난수 출력

//for (Integer rnd : rndNums) { System.out.print(rnd + " \n"); }

// 가장큰수 / 가장작은수 구하기

min = rndNums.stream().min(Integer::compare).get();

max = rndNums.stream().max(Integer::compare).get();

//System.out.printf("min : %d\n", min);

//System.out.printf("max : %d\n", max);

// 게임시작

int smin = 0, smax = 0;   // 선택한 값들 

int diffmin = 0, diffmax = 0; // 선택한 값들과 준비한 값의 차이

int bmin = 0, bmax = 0; // 0:같다, 1:니가크다, 2:내가크다

String[] mima_msg = {"같다", "그것보다작아요", "그것보다커요"}; 

System.out.println("=====================");

System.out.println("*** 1부터 100까지 난수를 10개 발생시켜 그중에서 *******");

System.out.println("*** 가장 작은수와 큰수를 맞추는 게임 *******");

System.out.println("=====================");

Scanner s = new Scanner(System.in);

int count = 0;

// 

do {

count++;

System.out.println("=====================");

// 큰수/작은수 선택

System.out.print("작은숫자맞추기 : ");

smin = s.nextInt(); s.nextLine();

System.out.print("큰숫자맞추기 : ");

smax = s.nextInt(); s.nextLine();

// 판단

// 수 차이

bmin = smin == min ? 0 : smin > min ? 1 : 2;

bmax = smax == max ? 0 : smax > max ? 1 : 2;

// 메세지

System.out.printf("작은수 : %s, 큰수 : %s \n", mima_msg[bmin], mima_msg[bmax]);

// 맞춘경우

if (bmin == 0 && bmax == 0) {

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");

System.out.println("^^^ 모두 맞춤 :  (총회수 : "+ count +" ) ^^");

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");

}

System.out.println("---------------------");

System.out.print("나가려면 0을 입력 : "); 

} while (s.nextInt()!=0);

System.out.println("*********** 게임끝 ************");

	
	}
	

}