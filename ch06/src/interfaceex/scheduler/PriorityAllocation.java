package interfaceex.scheduler;

public class PriorityAllocation implements scheduler {

	@Override
	public void getNextcall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 받습니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill이 높은 상담원에게 우선 상담 받습니다.");
	}

}
