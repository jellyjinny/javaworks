package nestedclass;

class OutClass{
	int num = 10;
	static int sNum = 20;
	
	//정적 내부 클래스
	static class InClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num = 20;  //외부 클래스의 인스턴스 변수는 사용불가
			sNum = 30;   //외부 클래스의 정적 변수는 사용 가능
			System.out.println(sNum + "(외부 클래스의 정적 변수)");
			System.out.println(inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println(sInNum + "(내부 클래스의 정적 변수)");
		}
		
		static void sTest() {
			//inNum = 200;  //내부 클래스의 인스턴스 변수는 사용불가
			sInNum = 300;   //내부 클래스의 정적 변수는 사용 가능
			System.out.println(sNum + "(외부 클래스의 정적 변수)");
			System.out.println(sInNum + "(내부 클래스의 정적 변수)");
		}
	}
} //OutClass 닫기


public class StaticInnerClass {

	public static void main(String[] args) {
		//정적 내부클래스는 외부 클래스로 직접 접근하여 객체 생성
		System.out.println("*** 정적 내부 클래스의 일반 메서드 호출 ***");
		OutClass.InClass inClass = new OutClass.InClass();
		inClass.inTest();
		//inClass.sTest();
		
		System.out.println("*** 정적 내부 클래스의 정적 메서드 호출 ***");
		OutClass.InClass.sTest();
	}

}
