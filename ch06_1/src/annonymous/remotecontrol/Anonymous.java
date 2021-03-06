package annonymous.remotecontrol;

public class Anonymous {

	RemoteControl field = new RemoteControl() {
		
		//필드 선언. 초기 값 대입
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
	void method1() {
		//로컬변수 선언. 초기값 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");
			}
		};
		
		//로컬변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
