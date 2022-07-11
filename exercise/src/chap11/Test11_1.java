package chap11;

import java.util.HashMap;

public class Test11_1 {

	public static void main(String[] args) {
		//1. 2
		
		//2. hashCode(), equals()
		
		//3.
		//HashMap 객체 생성
		//Student 객체를 식별키로 String 값을 저장함
		HashMap <Student, String> hashMap = new HashMap<>();
		
		//자료 삽입
		hashMap.put(new Student("1"), "95");
		
		//특정 자료 추출(검색)
		String score = hashMap.get(new Student("1"));
		
		System.out.println("1번 학생의 총점: " + score);
		
		//4.
		Member member = new Member("blue", "이파란");
		System.out.println(member);
		
		//5. 4
		
		
		//7
		String str = "모든 프로그램은 자바 언어로 개발할 수 있다";
		int index = str.indexOf("자바");
		System.out.println(index);
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
		}
		str = str.replace("자바", "Java");
		System.out.println("-->" + str);
		
		//8
		//-128~127은 값을 비교, 그 이외는 번지를 비고
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		//주소 비교
		System.out.println(obj1 == obj2);  //true
		System.out.println(obj3 == obj4);  //false
		
	}

}
