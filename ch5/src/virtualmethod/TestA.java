package virtualmethod;

public class TestA {

	//필드
	int num;
	
	//메서드
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
	
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
		
		//스택영역에 위치 - a1, a2는 heap을 가리키는 번지
		//힙 영역에 위치 - a1의 num, a2의 num
		//데이터 영역에 위치 - aaa()는 
	}
}
