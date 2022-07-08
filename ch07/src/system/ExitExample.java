package system;

public class ExitExample {

	public static void main(String[] args) {

		//반복구문을 강제 종료
		//현재 실행되는 프로세스 종료
		for(int i=0; i<10; i++) {
			if(i==5) {
				System.exit(0);  //정상 종료
				//break;
			}
			System.out.println(i);
		}
		System.out.println("반복 종료");
	}

}
