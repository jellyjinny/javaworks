package information_hiding;

public class MyDateTest {

	public static void main(String[] args) {
		//MyDate 클래스의 객체 생성
		MyDate date = new MyDate();
		//date.day = 20;
		date.setYear(1990);
		date.setMonth(2);
		date.setDay(29);
		
		System.out.println("내 생일은 " + date.getYear() + "년 " 
				+ date.getMonth() + "월 " + date.getDay() + "일입니다.");
	}
}
