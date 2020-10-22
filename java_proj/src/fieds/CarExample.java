package fieds;

public class CarExample {

	public static void main(String[] args) {
		Car2 myCar=new Car2();
		myCar.setGas(20);
		
		boolean gasState=myCar.isLeftGas();
		if(gasState) {System.out.println("출발");
		myCar.run();
		}
		if(myCar.isLeftGas()) {System.out.println("gas주입할필요없음");
				}
		else {
			System.out.println("gas 주입하세요");
		}

	}

}
