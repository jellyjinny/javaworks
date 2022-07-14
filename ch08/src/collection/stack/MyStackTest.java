package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		//객체 넣기
		stack.push("봄");    //0 인덱스
		stack.push("여름");   //1
		stack.push("가을");   //2
		stack.push("겨울");   //3
		
		//객체 빼기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); //-1
	}

}
