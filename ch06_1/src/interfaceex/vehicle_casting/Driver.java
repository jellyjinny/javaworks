package interfaceex.vehicle_casting;

public class Driver {
	
	//운전하다 - 매개변수로 vehicle 객체 사용
	public void drive(Vehicle vehicle) {
		//vehicle이 Bus의 객체라면
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
