package exeptions;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}
	//아래 메서드 = 예외코드 가진 메서드
public static void findClass() throws ClassNotFoundException {
	Class claszz= Class.forName("java.lang.String2");
	
}
}
