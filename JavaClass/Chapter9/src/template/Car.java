package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	// body 가 있으므로 abstract 가 아니다.
	public void washCar() {};
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	// template 메서드라고 한다.
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		// 애는 필요에 의해서 재정의해서 사용한다.
		washCar();
		turnOff();
	}
}
