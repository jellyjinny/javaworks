package type;

public class Variable {

	//main 빼먹었을땐 'main' 타자치고 Ctrl 스페이스 후 엔터 치면 아래처럼 나옴
	public static void main(String[] args) {
		String name;   //문자열 변수 name 선언(할당)
		name = "한지수";
		
		int grade;  //정수형 변수 grade 선언
		grade = 2;
		
		//int class;  이렇게 하면 오류남. 위에서 class 사용하고 있어서. 예약어는 변수로 사용할 수 없음.
		int schoolClass = 3;
		
		
		System.out.println(name + "는 " + grade
				+ "학년 " + schoolClass + "반 입니다");
	}
	
}
