package sec02.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(3000); //메인 스레드를 3초간 일시 정지
			}catch(InterruptedException e) {}
		}
	}

}
