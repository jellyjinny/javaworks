package object;

public class ToStringExample {

	public static void main(String[] args) {
		//toString() : 객체의 정보를 문자열로 출력하는 함수
		//String의 name 객체
		String name = new String("오상식");
		System.out.println(name);
		//
		System.out.println(name.toString());
		
		//Book 클래스에서 toString()을 쓰고싶으면 재정의 해야한다
		Book book = new Book(12, "개미");
		System.out.println(book.toString());
		
	}

}
