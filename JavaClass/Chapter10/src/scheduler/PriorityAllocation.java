package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 대기열에서 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 높은 상담원에게 보낸다.");
		
	}
}
