package constructors;

public class Number2 {
	
	int x;
	
	public Number2(int y) {  //매개변수가 있는 생성자
		x = y;
	}

	public static void main(String[] args) {

		Number2 myNum = new Number2(4);
		System.out.println(myNum.x);
	}

}
