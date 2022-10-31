package sec02.exam02;

public class Taxi implements Vehicle, sec02.exam03.Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
