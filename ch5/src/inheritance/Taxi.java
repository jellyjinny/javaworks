package inheritance;

class Car{
	String brand;  //차 브랜드
	int cc;        //배기량

	public Car(String brand, int cc) {
		this.brand = brand;
		this.cc = cc;
	}
}


public class Taxi extends Car{
	//필드
	int passenger;
	
	//부모 클래스가 매개변수가 있을때 super()에 변수를 매개로 전달함
	public Taxi(String brand, int cc, int passenger) {
		super(brand, cc);  //Person 클래스의 멤버 상속
		this.passenger = passenger;
	}
}
