package inherits;

public class Bird extends AbstractPar {
	String sort="새";
	
	public Bird(String name) {
		super(name);
		}
	@Override
	//부모클래스 AbstractPar 의 추상메서드 viewMember 구현.
	public void viewMember() {
		System.out.printf("%s의 이름은 %s입니다.새는 하늘에서 생활합니다. 하늘은 새의 자유로운공간",this.sort,this.name);
	}
}
