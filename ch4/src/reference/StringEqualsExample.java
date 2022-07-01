package reference;

public class StringEqualsExample {

	public static void main(String[] args) {
		//char v1 = 'a';
		//String v2 = null;
		
		int[] score = null;	
		String strVal1 = "장그래";
		String strVal2 = "장그래";
		
		//문자열이 같은지 비교(equals()를 사용한다)
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		//참조 주소가 같은지 비교(==)
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		}else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		String strVal3 = "장그래";
		String strVal4 = "장그래";
		
		//참조 주소가 같은지 비교(==)
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");
		}else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
	}

}
