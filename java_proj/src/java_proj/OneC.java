package java_proj;

public class OneC {

	public static void main(String[] args) {
		//하나의 컬럼
		//1. 변수선언(- 왼쪽정렬) (| 칸구분 스트링), (10s 알파벳10자) (%n 줄바꿈)
		
	String leftAlignFormat = "| %-15s| %-15s|  %6d|  %6d|%n"; // 열에 대한 포맷
	String msg = "1열데이터";
	String msa= "2열데이터";
	String msb= "3열데이터";
	String msc= "4열데이터";
	//2. 헤더
	System.out.format("+──────────────────+──────────────────+───────+────────+%n");
	System.out.format("|컬럼이름1           |컬럼이름2            |컬럼이름3| 컬럼이름4|%n");
	System.out.format("+──────────────────+──────────────────+───────+────────+%n");

	for (int i = 0; i < 6; i++) {
		msg +=i;msa +=i;msb +=i;
		
		
		System.out.format(leftAlignFormat,msg,msa,i*5,i*3);}
		
		//3.데이터부분
		
	
	System.out.format("+──────────────────+──────────────────+────────+────────+%n");
	
	

}
}
