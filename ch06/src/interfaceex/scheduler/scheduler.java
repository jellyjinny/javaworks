package interfaceex.scheduler;

public interface scheduler {

	//다음 전화를 가져오기
	public void getNextcall();
	
	//상담원에게 전화를 배분하기
	public void sendCallToAgent();
}
