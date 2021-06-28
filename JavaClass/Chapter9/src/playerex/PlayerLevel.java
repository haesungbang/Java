package playerex;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	// template 메서드: 하위 클래스에서 재정의 할 수 없다.
	final public void go(int count) {
		run();
		
		for(int i = 0; i < count; i++) {
			jump();
		}
		
		turn();
	}
	

}
