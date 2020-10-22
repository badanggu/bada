package inherits;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {

	
		// 컬렉션중에서 arrayList

		// ArrayList<항목의타입> 변수이름 =

		// new ArrayList<항목의타입>();

		ArrayList<AbstractPar> anis = new ArrayList<AbstractPar>();
		AbstractPar ani=null;
	ani=new Fish("구피");
	anis.add(ani);
	
	ani=new Bird("대머리독수리");
	anis.add(ani);
	
	ani=new LandAni("소");
	anis.add(ani);
	
	for (AbstractPar ani_i:anis) {
		System.out.println("---^^");
		ani_i.viewMember(); System.out.println();
	}
	}

		}


		