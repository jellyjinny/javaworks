package constructors;

public class Number {

	int x; //필드 - 멤버 변수
	
	public Number() {  //생성자
		x = 4;
	}
	
	public static void main(String[] args) {
		//자신(Number) 클래스를 사용
		Number myNum = new Number();
		System.out.println(myNum.x);
	}

}
