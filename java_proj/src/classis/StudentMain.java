package classis;

public class StudentMain {

	public static void main(String[] args) {
		// new 클래스이름() : 인스턴스
		//힙에 객체가 생성
		Student[] s1= new Student[3];//오른쪽이 먼저 실행돼서 s1에 담긴다
		s1[0]=new Student();
		s1[0].name = "손흥민"; 
		s1[0].sido = "영국";
		s1[0].age = 29;
	
		
		s1[1]=new Student();
		s1[1].name = "박지성"; 
		s1[1].sido = "서울";
		s1[1].age = 40;
		
	
		s1[2]=new Student();
		s1[2].name = "이승엽"; 
		s1[2].sido = "대구";
		s1[2].age = 45;
		
		
		System.out.println("====best player====");
		for (Student man: s1) {
				System.out.printf("%s(%s,%s세)\n",man.name,man.sido,man.age);}

	//아이유


	
	
	}

}
