package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {

		//dao 클래스 - Stack -> vector에서 상속
		Stack<Coin> coinBox = new Stack<>();
		
		//Coin 객체 생성
		Coin coin500 = new Coin(500);  
		Coin coin100 = new Coin(100); 
		Coin coin50 = new Coin(50);	
		Coin coin10 = new Coin(10);
		
		//동전을 스택에 넣기( 순서 : 500 - 100 - 50 - 10)
		coinBox.push(coin500);  //0번 인덱스
		coinBox.push(coin100);  //1번 인덱스
		coinBox.push(coin50);   //2번 인덱스
		coinBox.push(coin10);   //3번 인덱스

		System.out.println("총 객체수: " + coinBox.size());
		
		
		System.out.println(coinBox.get(0).getValue());
		
		
		//동전을 스택에서 빼기( 순서 : 10 - 50 - 100 - 500)
		while(!coinBox.isEmpty()) {  //비어있지 않으면
			Coin coin = coinBox.pop();  //코인 꺼내기
			System.out.println("꺼낸 동전: " + coin.getValue() + "원");
		}
	}
}
