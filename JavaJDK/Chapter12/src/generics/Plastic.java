package generics;

public class Plastic extends Material{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 플라스틱 입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("플라스틱 재료로 출력합니다.");
		
	}
}
