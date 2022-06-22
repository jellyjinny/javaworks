package operater;

public class Operator1 {

	public static void main(String[] args) {
		// 대입 연산자
		int num = 10;
		
		//sysou 치고 컨트롤 스페이스 치면 
		//이렇게 System.out.println(); 자동으로 나옴
		
		System.out.println(num);
		System.out.println(-num);  //부호만 바뀜

		//값을 변경하고 싶다면
		num = -num;
		System.out.println(num);
		
		String season = "Summer";
		System.out.println(season);
		
		//배열
		String[] seasons = {"spring", "summer", "fall", "winter"};
		System.out.println(seasons[0]);
		System.out.println(seasons[3]);
		System.out.println("=============");
		System.out.println(seasons.length + "개");
		
		for(int i = 0; i < seasons.length; i++) {
			System.out.println(seasons[i]);
		}
	}

}
