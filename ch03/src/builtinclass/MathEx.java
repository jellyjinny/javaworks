package builtinclass;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스 사용. (Math는 new를 쓰지 않는다.)
		int v1 = Math.abs(-10); //절대값
		System.out.println(v1);
		
		long v2 = Math.round(5.6); //반올림
		System.out.println(v2);
		
		double v3 =Math.floor(5.9); //소수점 이하 버림
		System.out.println(v3);
		
		int max = Math.max(10,  20);  //두 수 중 큰수
		System.out.println(max);
		
		double rand = Math.random();  // 난수 0.0<= rand <1.0
		System.out.println(rand);
		
		//주사위 구현
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈: " + dice);
	}

}
