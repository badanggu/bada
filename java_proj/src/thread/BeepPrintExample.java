package thread;

public class BeepPrintExample {

	public static void main(String[] args) {
		Runnable beepTask= new BeepTask();
		Thread thread= new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("띵");
			try {Thread.sleep(800);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}

}
