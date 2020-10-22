package thread;
import java.awt.Toolkit;

public class BeepPrintE3 {
	
	public static void main(String[] args) {
		
		Thread thread= new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i <10; i++) {
					toolkit.beep();
					try {Thread.sleep(800);} catch (Exception e) {	}
					
				}
			}
		});
		
thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
			try {Thread.sleep(800);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
