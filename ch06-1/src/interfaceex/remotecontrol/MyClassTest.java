package interfaceex.remotecontrol;

public class MyClassTest {

	public static void main(String[] args) {
		
		System.out.println("1)----------------");
		//rc 필드를 사용
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		//생성자의 매개 변수
		MyClass myClass2 = new MyClass(new Television());
		
		System.out.println("3)----------------");
		//메서드의 로컬 변수(지역 변수)
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		//메서드의 매개 변수
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}


