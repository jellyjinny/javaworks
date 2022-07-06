package chap09;

public class Car {
	//인스턴스형 내부 클래스
	class Tire{
		Tire(){
			System.out.println("Tire 객체 생성");
		}
	}
	//정적 내부 클래스
	static class Engine{
		Engine(){
			System.out.println("Engine 객체 생성");
		}
	}	
}
