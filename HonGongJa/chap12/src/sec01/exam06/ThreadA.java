package sec01.exam06;

public class ThreadA extends Thread{

	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		System.out.println(getName() + "가 출력한 내용");
	}
}
