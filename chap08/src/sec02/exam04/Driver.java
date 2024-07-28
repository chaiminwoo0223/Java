package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

// 객체 타입 변환
public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle 매개변수가 참조하는 객체가 Bus인지 조사!
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
