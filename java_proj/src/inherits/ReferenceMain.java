package inherits;

public class ReferenceMain {

	public static void main(String[] args) {
		//변수타입도 부모, 메모리에 생성된 객체도 부모
		Parents pc =new Parents();
		pc.name="손흥민"; pc.age=29;
		
		//아래껀 왜되나? pcson에 SonClass에 다 있어야돼(parents가 부모라서 SonClass에 전부 상속되어있어-그래서 가능)
		//아래껀 변수타입은 객체, 메모리에 생성된 객체는 자식//클래스는 일차원배열 
		Parents pcson=new SonClass();
		pcson.name="손연재"; pcson.age=27;
		
//형변환: 참조하는 타입을 다른타입으로 변환
		SonClass son2=(SonClass)pcson;
		son2.isArmy= true;
		System.out.printf("%s(%s,%s)",son2.getName(),son2.getAge(),son2.getIsArmy()?"현역":"면제");
	}

}
