package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i <10; i++) {
			toolkit.beep();
			try {Thread.sleep(800);
				
			} catch (Exception e) { 
				// 
			}
			
		}
	}
}
