package customer;

public class Customer {
	//필드
	private int customerID;          //고객 ID
	private String customerName;     //고객 이름
	protected String customerGrade;    //고객 등급
	protected int bonusPoint;          //보너스 포인트
	protected double bonusRatio;       //보너스 적립율
	
	//생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;   //1%
	}
	
	//매개 변수를 가진 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;   //1%
	}
	
	//getter, setter 메서드
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//보너스 적립 계산
	public int calcPrice(int price) {
		//보너스 포인트 = 가격 X 적립율
		//bonusPoint = 0
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//고객 정보 출력
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade +
				"이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}
}
