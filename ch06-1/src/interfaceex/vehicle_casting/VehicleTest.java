package interfaceex.vehicle_casting;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus(); //자동 타입 변환
		
		vehicle.run();
		//vehicle.checkFare(); //보이지 않음
		
		//강제 타입 변환 - 다운캐스팅
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
