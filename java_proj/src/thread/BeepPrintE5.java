package thread;

import java.awt.Toolkit;

import javax.swing.JFrame;

//BeepThread라는 자식객체 이용하기
public class BeepPrintE5 extends JFrame {

	public static void main(String[] args) {
		Thread thread= new Thread() {
		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i <10; i++) {
				toolkit.beep();
				try {Thread.sleep(800);} catch (Exception e) {	}
			}
		}
			};
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("띵");
			try {Thread.sleep(800);
				
			} catch (Exception e) {
	}

}
	}
}
