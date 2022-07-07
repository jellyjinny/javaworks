package innerinterface.window;

public class Button {
	OnClickListener listener;  //인터페이스타입 필드
	
	void setOnClickListener(OnClickListener listener) {  //매개변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); //구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener {
		void onClick();  //중첩 인터페이스
	}
	
}
