package operater;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 짝수or홀수 판별하는 프로그램
		// 조건 연산자를 활용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
	
		int n = sc.nextInt();
		
		String result = (n % 2 != 0) ? "홀수" : "짝수";
		
		System.out.println(result);
		
		sc.close();

	}
}
