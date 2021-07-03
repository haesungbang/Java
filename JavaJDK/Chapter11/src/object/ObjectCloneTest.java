package object;

class Point{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + this.point + "," + "반지름은 " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class ObjectCloneTest {

	// throws 하면 exception 처리를 안하겠다?
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone();
		
		// implements Cloneable 작성하기
		System.out.println(circle.hashCode());
		System.out.println(cloneCircle.hashCode());
		
		System.out.println(circle);
		System.out.println(cloneCircle);
		
	}

}
