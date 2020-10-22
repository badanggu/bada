package example;

public class Anonymous {


 Person field=new Person() { // 클래스 아래 필드값으로 익명 객체 대입
	void work() {
		System.out.println("출근합니다");
	}
@Override
void wake() {
	System.out.println("6시에 일어납니다");
	work();
}

};

void method1() {
	
	Person localVar = new Person() { //메소드 안에 변수값으로 대입한거
		void walk() {
			System.out.println("산책합니다");
					}
	@Override
	void wake() {
		System.out.println("7시에 일어납니다");
		walk();
	}
	
	};
	
	localVar.wake();
}

void method2(Person person) { //ㅁㅔ소드 안에 인자로 만든거
	person.wake();
}
}