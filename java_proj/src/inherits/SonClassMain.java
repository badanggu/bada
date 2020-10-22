package inherits;

public class SonClassMain {

	public static void main(String[] args) {
		SonClass son = new SonClass();
		son.name="이승엽";
		son.age=5;
		//상속받은 멤버의 값 출력
		System.out.printf("son.name:%s(%d세) \n", son.name,son.getAge());
		
SonClass son2=new SonClass("이찬호",7,false);
//이찬호(7세 ,병역미필)
 
	System.out.printf("%s(%d세,%s) \n", son2.name,son2.getAge(),son2.getIsArmy()?"병역필":"병역미필");
	//부모의 메서드를 오버라이드해서, 값을 넣고 출력
	
	SonClass son3=new SonClass();
	son3.setHuman("이찬호",7,false);
	System.out.println("==부모의 메서드를 오버라이드해서, 값을 넣고 출력==");
	
	System.out.printf("%s\n", son3.getHuman());
	
	
	
	}

	
}
