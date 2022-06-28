package thisexample;

class BirthDay{
	int year;
	int month;
	int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {  //this를 출력하는 함수
		System.out.println(this);
	}
}

public class ThisTest {

	public static void main(String[] args) {

		BirthDay bDay = new BirthDay();
		bDay.setYear(2022);
		
		System.out.println(bDay); //클래스이름@메모리 주소
		bDay.printThis();
	}
}
