package sec01.exam02;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable beeptask = new BeepTask();
		
		Thread thread = new Thread(beeptask);
		thread.start();
	
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);}
			catch(Exception e) {}
		}
	}

}