package abstractex.car;

public class Truck extends Car{
	
	public void load() {
		System.out.println("트럭에 짐을 싣습니다.");
	}

	//Car의 추상 메서드 재정의(구현)
	@Override
	public void run() {
		System.out.println("트럭이 주행합니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}

}
