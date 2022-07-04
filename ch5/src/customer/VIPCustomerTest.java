package customer;

public class VIPCustomerTest {

	public static void main(String[] args) {
		//VIP 고객 객체 생성
		VIPCustomer customerKing = new VIPCustomer();
		
		customerKing.setCustomerName("세종대왕");
		customerKing.setAgentID(1446);
		
		//상품 구메
		int price = 10000;
		customerKing.calcPrice(price);  
		
		int price2 = 10000;
		customerKing.calcPrice(price2); 
				
		System.out.println(customerKing.showCustomerInfo());
		
	}
}