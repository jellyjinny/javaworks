package override;

public class ShopMain {

	public static void main(String[] args) {
		//HeadShop 객체 생성
		HeadShop headShop = new HeadShop();
		System.out.println("본점 입니다.");
		headShop. sellDoenjangjjige();
		headShop. sellKimchijjige();
		headShop. sellBibimbap();
		System.out.println("=======================");
		
		
		//Shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDoenjangjjige();
		shop1.sellKimchijjige();
		shop1.sellBibimbap();
		
		System.out.println("=======================");
		Shop2 shop2 = new Shop2();
		shop2.sellDoenjangjjige();
		shop2.sellKimchijjige();
		shop2.sellBibimbap();
	}

}
