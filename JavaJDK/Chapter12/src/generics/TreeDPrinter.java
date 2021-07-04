package generics;

// 이렇게 쓰면 Material 을 상속받는 애들만 자료형으로 쓸 수 있다.
public class TreeDPrinter<T extends Material> {

	// Object 는 모든 클래스의 상위
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
