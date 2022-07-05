package absractext.animal;

public abstract class Animal {

	public String kind;
	
	//메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메서드 - 선언만 있고 구현부가 없다
	public abstract void sound();
}
