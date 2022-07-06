package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car bus = new Bus();
		Car truck = new Truck();
		
		bus.run();
		bus.refuel();
		bus.stop();
		
		truck.run();
		truck.refuel();
		truck.stop();
	}

}
