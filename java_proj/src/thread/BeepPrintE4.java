package thread;
//BeepThread라는 자식객체 이용하기
public class BeepPrintE4 {

	public static void main(String[] args) {
		Thread thread= new BeepThread();
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("띵");
			try {Thread.sleep(800);
				
			} catch (Exception e) {
	}

}
	}
}
