package generics;

public class Powder extends Material{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("파우더 재료로 출력합니다.");

	}
}
