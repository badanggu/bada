package inherits;

public class LandAni extends AbstractPar {
	String sort="육지동물";
	
	public LandAni(String name) {
		super(name);
		}
	@Override
	//부모클래스 AbstractPar 의 추상메서드 viewMember 구현.
	public void viewMember() {
		System.out.printf("%s의 이름은 %s입니다.육지동물은 땅에서 활동합니다.땅은 육지동물의 생활터전",this.sort,this.name);
	}
}
