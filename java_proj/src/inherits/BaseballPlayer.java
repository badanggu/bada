package inherits;

public class BaseballPlayer extends Player{
	//생성자
	public BaseballPlayer(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.printf("%s가 야구를 합니다\n",this.name);
	}
}
