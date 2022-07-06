package exception;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		//실행(런타임) 예외
		try {
			int[] num = new int[2];
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		System.out.println("Done");
	}
}
