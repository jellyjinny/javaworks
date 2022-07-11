package chap11;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		//HashMap 객체 생성
		//Student 객체를 식별키로 String 값을 저장함
		HashMap <Student, String> hashMap = new HashMap<>();
		
		//자료 삽입
		hashMap.put(new Student("1"), "95");
		
		//특정 자료 추출(검색)
		String score = hashMap.get(new Student("1"));
		
		System.out.println("1번 학생의 총점: " + score);

	}

}