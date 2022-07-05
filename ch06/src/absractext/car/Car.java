package absractext.car;

public abstract class Car {
	//추상클래스
	public abstract void run();		//주행하다
	public abstract void reFuel();	//주유하다
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
