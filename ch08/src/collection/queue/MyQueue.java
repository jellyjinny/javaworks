package collection.queue;

import java.util.ArrayList;
import java.util.List;

//문자를 관리할 DAO
public class MyQueue {
	
	private List<String> arrayQueue = new ArrayList<>();
	
	//Queue의 맨 뒤에 추가됨
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//큐의 맨 앞에서 꺼냄(0번 인덱스만 삭제됨)
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
}