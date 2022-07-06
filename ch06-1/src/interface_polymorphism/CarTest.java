package interface_polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.run();
		
		//앞바퀴 교체
		System.out.println("*** 앞바퀴 교체 ***");
		myCar.frontLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		myCar.run();
	}

}
