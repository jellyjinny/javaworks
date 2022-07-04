package finalex;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//재정의 할 수 없다.
	/*public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}*/
	
}
