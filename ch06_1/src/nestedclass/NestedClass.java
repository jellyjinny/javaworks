package nestedclass;


class A{
	
	//생성자
	A(){System.out.println("A 객체가 생성됨");}
	
	//필드 - 인스턴스 클래스, static을 사용할 수 없다.
	class B{
		int field1;
		//static int field2;  
		B(){ System.out.println("B 객체가 생성됨");}
		void method1() {}
		//static void method2() {}
	}
	
	//필드 - 정적 클래스
	static class C{
		int field1;
		static int field2;
		C(){ System.out.println("C 객체가 생성됨");}
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스 - 메서드 내에 선언된 클래스
		int n = 1;
		class D{
			int field1;
			//static field2; 로컬(local)에서 static 사용불가
			D(){System.out.println("D 객체가 생성됨");}
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

public class NestedClass {

	public static void main(String[] args) {
		
		A a = new A();
		
		//인스턴스 클래스 객체 생성 방법
		A.B b = a.new B();
		b.field1 = 4;
		b.method1();
		
		//정적 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 5;
		A.C.field2 = 6;  //static인 경우
		c.method1();
		A.C.method2();
		
		//메서드 호출 - 로컬 클래스 사용
		a.method();
	}

}









