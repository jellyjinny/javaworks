package statement;

public class Alcohol extends Drink{
	
	//필드
	float alcper; //알콜 도수
	
	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	//static 메서드인 경우는 @override 애너테이션 사용하지 않음
	//재정의는 객체 생성될때 작동하기 때문이다.
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	
	@Override
	public void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
}
