package thread;

import java.awt.Toolkit;
//원래 있는 Thread를 상속받기--ex4에서 실행
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i <10; i++) {
			toolkit.beep();
			try {Thread.sleep(800);} catch (Exception e) {	}
			
		}

}

}