package inherits;

public class DaughterClassMain {

	public static void main(String[] args) {
		DaughterClass dc=new DaughterClass();
		dc.name="심고집"; dc.age=2;
		dc.setCosmetics(new String[] {"로션","아이크림","수분크림","젤"});
		String msgCosmetics="";
		for(String cos:dc.getCosmetics()) {
			msgCosmetics += " " + cos;
		
		}
		System.out.printf("이름:%s(%d세, 화장품목록: %s )\n", dc.name,dc.age,msgCosmetics);
	}

}
