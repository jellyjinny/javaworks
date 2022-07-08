package string;

public class StringConcat {

	public static void main(String[] args) {
		// concat() - 문자열 연결하기

		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결 후 문자열 주소값 : " + System.identityHashCode(javaStr));
	}

}
