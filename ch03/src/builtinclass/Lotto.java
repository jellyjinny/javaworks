package builtinclass;

public class Lotto {

	public static void main(String[] args) {
		// 로또 번호 생성 프로그램

		int[] lotto = new int[6];
		int i, j;
		System.out.println(lotto.length);
		
		//로또번호 생성
		for(i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			//중복 번호 제거
			for(j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복번호 : " + lotto[i]);
					i--;
				}
			}
		}
	   /*
	     27 23  6 39 33 30  ->  23이 중복번호인 경우 
	     i=0,  j=0,        27
	     i=1,  j=0,1       23
	     i=2,  j=0,1,2     23
	     i=2,  j=0,1,2     6
	    *
	    */	
		
		//로또 번호 출력
		for(i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
	}
}

