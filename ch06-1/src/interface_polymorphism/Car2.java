package interface_polymorphism;

public class Car2 {
	//필드 - 인터페이스타입으로 객체 생성
	/*Tire[] tires = {
		new HanTire(),  //0번 위치
		new HanTire(),  //1
		new KumTire(),  //2
		new KumTire()   //3
	};*/
	
	Tire[] tires = new Tire[] {
		new HanTire(),  //0번 위치
		new HanTire(),  //1
		new KumTire(),  //2
		new KumTire()   //3
	 }; 

	//메서드
	void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}
}
