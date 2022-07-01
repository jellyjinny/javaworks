package breakexample;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g')
					break Outter; //Outter 레이블을 찾아서 완전 빠져나감
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}