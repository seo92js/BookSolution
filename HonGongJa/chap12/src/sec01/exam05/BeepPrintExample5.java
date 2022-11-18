package sec01.exam05;

import java.awt.Toolkit;

public class BeepPrintExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i =0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
