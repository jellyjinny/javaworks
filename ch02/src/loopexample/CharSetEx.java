package loopexample;

public class CharSetEx {

	public static void main(String[] args) {
		// 문자 세트(아스키코드 < 유니코드)
		char ch;
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();  //줄바꿈;
		
		//한글 - 자음과 모음
		for(ch = 12593; ch < 12686; ch++) {
			//ch라는 변수가 있기 때문에 초기화를 ch = 12593; 이렇게 하면 된다.
			System.out.print(ch + " ");
		}
		System.out.println();  //줄바꿈;
		
		//구구단 6단 출력
		int dan = 6;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + dan * i);
		}
	}

}
