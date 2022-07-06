package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		//컴파일 예외(일반 예외)
		//클래스가 없을 때 발생하는 예외
		//forName(클래스이름)
		try {
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
