package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam02.Taxi;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
