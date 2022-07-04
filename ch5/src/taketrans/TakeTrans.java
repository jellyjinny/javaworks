package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		//사람 객체 생성
		Student sohee = new Student("박소희", 10000);
		Student daeho = new Student("이대호", 20000);
		//버스 객체 생성
		Bus bus100 = new Bus("bus100");
		//택시 객체 생성
		Taxi kakaoTaxi = new Taxi("카카오택시");

		//버스 탐
		sohee.take(bus100, 1200);
		daeho.take(bus100, 1200);
		
		//택시 탐
		sohee.take(kakaoTaxi, 3800);
		daeho.take(kakaoTaxi, 5000);
		
		//정보 출력
		sohee.showInfo();
		daeho.showInfo();
		bus100.showInfo();
		kakaoTaxi.showInfo();
	}

}
