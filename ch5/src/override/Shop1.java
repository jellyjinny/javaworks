package override;

public class Shop1 extends HeadShop {

	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	//메서드 재정의 - 부모 클래스와 내용이나 기능이 다를 때 재정의
	//애너테이션 - '@' 컴파일러에게 신호는 보내는 것
	@Override
	public void sellDoenjangjjige() {
		System.out.println("된장찌개: 6,000");
	}
	@Override
	public void sellKimchijjige() {
		System.out.println("김치찌개: 6,500");
	}
	@Override
	public void sellBibimbap() {
		System.out.println("된장찌개: 6,500");
	}
}
