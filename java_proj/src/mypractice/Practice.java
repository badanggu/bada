package mypractice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int H= s.nextInt();
		int M= s.nextInt();
		int c= H*60+M-45;
		int h=c/60;
		int m=c%60;
		
		if(h == 0 && m < 45) {
			h = 23;
			m = m+15;
		}
		System.out.printf("%d시 %d분",h,m);
	}

}
