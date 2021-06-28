package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("AI가 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("AI가 멈춥니다.");
		
	}
	@Override
	public void wiper() {
		System.out.println("AI가 와이퍼를 작동합니다.");
		
	}
	
	public void washCar() {
		System.out.println("AI가 세차를 작동합니다.");
		
	}
	

}
