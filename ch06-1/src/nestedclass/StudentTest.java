package nestedclass;

public class StudentTest {

	public static void main(String[] args) {
		Student jang = new Student("장그래");
		
		//내부 클래스 객체 생성 - 외부 클래스 객체를 통하여 생성 가능
		Student.Score score = jang.new Score();
		
		score.eng = 88;
		score.math = 75;
		score.showInfo();
	}
}
