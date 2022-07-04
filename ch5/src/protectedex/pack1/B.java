package protectedex.pack1;

public class B {
	
	//메서드
	public void method() {
		A a = new A();
		a.field = "value"; //같은 패키지에서 접근 허용
		a.method();
	}
}
