package mypractice;

import mypractice.Player;
import mypractice.Animal;

public class Animal {
Player player;
	
	public Animal(Player player) {
		this.player=player;}
	
	//메서드
	public void play() {
		player.play();
		
	
	}
}