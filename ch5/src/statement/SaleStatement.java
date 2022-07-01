package statement;

public class SaleStatement {
	
	public static void main(String[] args) {

		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.4f);
		
		//드링크 전표
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		//알콜 전표
		Alcohol.printTitle();
		soju.printData();
		
		//전체 총액
		int sum = coffee.getTotalPrice() + tea.getTotalPrice()
				+ soju.getTotalPrice();
		
		System.out.println("\n*** 합계 금액 " + sum + "원 ***");
	}

}
