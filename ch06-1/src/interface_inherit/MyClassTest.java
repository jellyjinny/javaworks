package interface_inherit;

public class MyClassTest {

	public static void main(String[] args) {
		//MYClass의 객체 생성
		MyClass myClass = new MyClass();
		
		X x = myClass;  //자동 타입 변환
		x.x();
		
		Y y = myClass;
		y.y();
		
		System.out.println("*** 다중 상속한 iClass 사용");
		MyInterface iClass = myClass;  //자동 타입 변환
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}
}
