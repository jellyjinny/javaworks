package object;

public class EqualsTest {

	public static void main(String[] args) {
		String color1 = new String("빨강");
		String color2 = new String("빨강");
		
		//String으로 생성한 인스턴스의 메모리 주소와 값 비교
		System.out.println(color1 == color2);  //false : 메모리 주소는 다르다
		
		//저장된 문자열 값 비교
		System.out.println(color1.equals(color2)); //true : 저장된 값은 같다
		
		
		//Book으로 생성한 인스턴스의 메모리 주소 값 비교
		Book book1 = new Book(12, "개미");
		Book book2 = new Book(12, "개미");
		
		//메모리 주소 비교
		System.out.println(book1 == book2);  //false 
		
		//저장된 문자열 값 비교
		System.out.println(book1.equals(book2)); //재정의 시 true
				
		
		//hashCode() 테스트
		System.out.println(color1.hashCode());
		System.out.println(color2.hashCode());

		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}

}
