package inherits;
//추상클래스: 부모클래스
//추상메서드: 선언부만 존재, 내용이 없음
//public abstract class- [접근제한자]abstract class추상클래스 이름{  } - 추상클래스 형식
public abstract class AbstractPar {
	/*멤버변수*/
	String name;
	public AbstractPar(String name) {
		this.name=name;
	}
	//추상메서드---식별자로만 사용하는게 용도--내용은 없고,그래도 부모에게 이름이 있으니까, 형변환 할 필요가 없다
	public abstract void viewMember();
	
	
	//일반 메서드(스트링 네임으로 게터세터 만들어주기)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
