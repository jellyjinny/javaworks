package innerinterface.button;

public class Button {
	
	OnClickListener listener; //인터페이스형 필드
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	//내부 인터페이스
	static interface OnClickListener{
		//추상 메서드
		public void onClick();
	}
}
