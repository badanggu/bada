package mypractice;



public class Mamm extends Player {
	//생성자
	public Mamm(String name) {
		super(name);//Player꺼 
	}
	
	@Override //부모도 play가 있기때문에 오버라이드
	public void play() {
		System.out.printf("내가 쓴 오답노트:%s \n"
				+ " (덧붙임)고구려의 혼인 제도로 여성의 집에 서옥(사위의 집)을 짓고 이곳에 남성을 머무르게 한다. \n",this.name);
	}
}


