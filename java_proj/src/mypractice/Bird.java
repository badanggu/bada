package mypractice;

public class Bird extends Player {
	//생성자
	public Bird(String name) {
		super(name);//Player꺼 
	}
	
	@Override //부모도 play가 있기때문에 오버라이드
	public void play() {
		System.out.printf("%s. 덧붙임) 공동체의 집단적인 농경의례의 하나로서 풍성한 수확제·추수감사제 성격을 지니는 부여시대의 제천의식.\n",this.name);
	}


}
