package scheduler;

public class LeastJob implements Scheduler {

    @Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기열에서 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기열이 적은 상담원에게 보낸다.");
		
	}
}
