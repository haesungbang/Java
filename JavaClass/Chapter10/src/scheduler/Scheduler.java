package scheduler;

public interface Scheduler {
	// 이것을 정책 하나하나마다 구현하면 된다.
	// 하나씩 순서대로 던진다, 대기열이 짧은 곳에 던진다.
	// 우선순위가 높은 고객을 먼저 할당.
	void getNextCall();
	void sendCallToAgent();
}
