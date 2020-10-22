package fieds;

//import java.util.Scanner;

public class Calculator {

	void powerOn() {System.out.println("전원을 켭니다");}
	int plus(int x,int y) {int result =x+y; return result;}
	
	double avg(int x, int y) {double sum=plus(x,y); 
	double result=sum/2;
	return result;}
	void execute() {
		double result =avg(7,10);
		println("실행결과"+result);}
	void println(String message) {System.out.println(message);}
	
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		//Scanner s= new Scanner(System.in);
		//java.util.Scanner s=new java.util.Scanner(System.in); ---- 임포트 안쓰면 앞에 많이 패키지이름,클래스 이름 이렇게 써줘야됨;
				myCalc.execute();
	
	}

}
