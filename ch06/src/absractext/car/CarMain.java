package absractext.car;

public class CarMain {

	public static void main(String[] args) {

		Car bus = new Bus();
		Car truck = new Truck();

		
		bus.run();
		bus.reFuel();
		bus.stop();
		
		truck.run();
		truck.reFuel();
		truck.stop();
	}

}
