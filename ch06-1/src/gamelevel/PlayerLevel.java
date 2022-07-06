package gamelevel;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드
	public final void go(int count) {
		run();
		//jump()는 반복 구문
		for(int i = 1; i <= count; i++) {
			jump();
		}
		turn();
	}
}
