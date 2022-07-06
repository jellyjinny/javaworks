package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain2 {

	public static void main(String[] args){

		System.out.println("전화 상담 배분 방식을 선택하세요");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객이 먼저 할당");
		
		int ch;
		try {
			ch = System.in.read();
			//인터페이스 형으로 객체 변수 선언
			Scheduler scheduler = null;
			if(ch=='R' || ch=='r') {
				scheduler = new RoundRobin();
				
			}else if(ch=='L' || ch=='l') {
				scheduler = new LeastJob();
			}else if(ch=='P' || ch=='p') {
				scheduler = new PriorityAllocation();
			}else {
				scheduler = null;
				System.out.println("지원되지 않는 기능입니다.");
			}
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main 닫기

}








