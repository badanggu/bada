package inherits;

public class FootballPlayer extends Player{
	//생성자
	public FootballPlayer(String name) {
		super(name);//Player꺼 
	}
	
	@Override //부모도 play가 있기때문에 오버라이드
	public void play() {
		System.out.printf("%s가 축구를 합니다\n",this.name);
	}
}