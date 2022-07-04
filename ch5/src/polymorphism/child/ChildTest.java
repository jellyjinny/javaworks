package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = child;  //자동 타입 변환
		//Parent child = new Child;
		
		parent.method1();  //Parent-method1() 가 나옴
		parent.method2();  //Child-method2() 가 나옴 - 자식클래스의 메서드가 호출됨
		//parent.method3();   //호출 불가
		
		//강제 타입 변환
		Child child2 = (Child)parent;
		child2.method3();
	}

}
