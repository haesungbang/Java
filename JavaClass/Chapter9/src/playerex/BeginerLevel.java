package playerex;

public class BeginerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 할 줄 모르지롱");

	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모르지롱");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("비기너 입니다.");

	}

}
