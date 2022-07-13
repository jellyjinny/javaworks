package generic.box2;

import generic.box.Apple;

public class GenericBoxTest {

	public static void main(String[] args) {
		// String type
		Box box = new Box();
		box.set("Good Luck!");
		String msg = (String)box.get(); //Object형으로 반환, 강제 타입변환
		System.out.println(msg);
		
		// Apple클래스
		box.set(new Apple("사과"));
		Apple apple = (Apple)box.get(); 
		System.out.println(apple);

	}

}
