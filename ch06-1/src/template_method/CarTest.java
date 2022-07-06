package template_method;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("===== 사람이 운전하는 자동차 =====");
		Car myCar = new ManualCar();
		myCar.run();
		
		System.out.println("===== 자율 주행하는 자동차 =====");
		Car yourCar = new AICar();
		yourCar.run();
	}
}
