package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("1.포도 | 2.복숭아 | 3.바나나");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			Fruit fruit = null;
			if(selectNo == 1) {
				fruit = new Grape();  //부모클래스로 객체 생성 - 자동타입 변환			
			}else if(selectNo == 2) {
				fruit = new Peach();
			}else if(selectNo == 3) {
				fruit = new Banana();
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
			fruit.showInfo();
		}catch(Exception e) {
			System.out.println("올바른 문자를 입력하세요.");
		}  //try~catch 닫기
		
		sc.close();
			
	}//main닫기

}
