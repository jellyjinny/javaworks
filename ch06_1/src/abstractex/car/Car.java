package abstractex.car;

public abstract class Car {

	public abstract void run();     //주행하다
	
	public abstract void refuel();  //주유하다
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
