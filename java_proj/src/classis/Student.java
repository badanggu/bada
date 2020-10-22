package classis;

public class Student {
	/*멤버변수 선언*/
	String name;
	String sido;
	int age;
	//위에 네임,시도 ,에이지는 얘는 인스턴스의 멤버야--static이 안써져있어서
	
	/*생성자* new하고 나온거, this 로 인스턴스---생성자는 객체를 리턴하기 때문에 리턴 타입을 안넣어 --리턴값이 없고, 여러개 만들수있는 이유는 인자를 바꿔줄수있으니까 메서드는? */
	
	//기본생성자
	public Student(){} //기본생성자를 만들어줘야돼.객체를 생성하려고 만든거. 뒤에 인자를 넣으려고!
	
	//사용자정의 생성자
		public Student(String name, String sido, int age) {
			this.name=name;
			this.sido=sido;
			this.age=age;
	}
}
