package classis;

public class SportmanCons {

	public static void main(String[] args) {
		// new 클래스이름() : 인스턴스
		//힙에 객체가 생성
		Student[] s1= new Student[3];//오른쪽이 먼저 실행돼서 s1에 담긴다
	
		s1[0]= new Student("손흥민","영국",2);
		s1[1]= new Student("박지성","서울",20);
		s1[2]= new Student("이승엽","대구",45);
		
		
		System.out.println("====best player====");
		for (Student man: s1) {
				System.out.printf("%s(%s,%s세)\n",man.name,man.sido,man.age);}

	//아이유

	
	
	
	}

}
