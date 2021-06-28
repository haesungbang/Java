package abstractex;

public abstract class Computer {

	// 2개의 추상 메서드 
	public abstract void display(); // {} body 가 없다.
	                       // 구현을 안 하겠다. 메서드를 선언만 한다.
	public abstract void typing();
	
	// 2개의 구현 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
