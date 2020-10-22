package inherits;

public class Fish extends AbstractPar {
	String sort="어류";
	
	public Fish(String name) {
		super(name);
		}
	@Override
	//부모클래스 AbstractPar 의 추상메서드 viewMember 구현.
	public void viewMember() {
		System.out.printf("%s의 이름은 %s입니다.어류는 물에서 생활합니다.물은 어류의 생활터전",this.sort,this.name);
	}
}
