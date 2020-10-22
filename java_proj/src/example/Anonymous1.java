package example;

public class Anonymous1 {

	RemoteControl field=new RemoteControl() {
		
		@Override
		public void turnOn() {
 System.out.println("tv켜기");
			
		}
		
		@Override
		public void turnOff() {
System.out.println("Tv끄기");
			
		}
	};
	
	void method1() {
		RemoteControl localVar= new RemoteControl() {
			
			@Override
			public void turnOn() {
				 System.out.println("audio켜기");
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio끄기");
				
			}
					};
			localVar.turnOn();//오디오 인스턴스 불러내
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
