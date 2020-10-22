package example;

public class AnonymousExamp {

	public static void main(String[] args) {
		Anonymous1 anony= new Anonymous1();
		anony.field.turnOn();
		anony.method1();
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("스마트tv켜기");
						
					}
					
					@Override
					public void turnOff() {
						System.out.println("스마트tv끄기");
						//마지막껀 바로 전에 인수에서 rc.turnOn() 메소드를 ㅎㅎ츌 위에꺼만 켜져
					}
				});

	}

}
