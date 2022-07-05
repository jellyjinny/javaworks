package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		//인터페이스형 타입으로 객채 생성
//		Television tv = new Television();	
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		
		tv.turnOn();
		tv.setVolume(12);
		tv.setMute(false);
		tv.setMute(true);
		RemoteControl.changeBattery();
		tv.turnOff();
		System.out.println("================");
		
		audio.turnOn();
		audio.setVolume(-1);
		audio.setMute(true);
	}
}

