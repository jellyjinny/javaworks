package breakexample;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//홀수인 경우 실행되지 않고 반복함
			if(i%2 != 0)
				continue;
			System.out.println(i);
		}
	}
}