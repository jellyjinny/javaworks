package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		//추상클래스는 객체 생성 불가
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.powerOn();
		smartPhone.internetSearch();
		smartPhone.powerOff();
	}
}
