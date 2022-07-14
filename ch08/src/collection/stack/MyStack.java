package collection.stack;

import java.util.ArrayList;
import java.util.List;

//Coin을 관리할 DAO
public class MyStack {

	private List<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//자료 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//자료 빼기(삭제)
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;  //String형이므로 null로 초기화된다.
		}
		return arrayStack.remove(len-1); //0번 인덱스부터 시작하므로 len에서 1을 빼기
	}
	
	
}
