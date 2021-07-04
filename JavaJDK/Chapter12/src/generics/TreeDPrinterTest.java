package generics;

import java.util.ArrayList;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이렇게 generic class 를 활용하면,원하는 참조형 타입을 사용해서 다운캐스팅 할 필요가 없다.
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		// generic 안 쓸 경우, (Powder)를 안쓰면 반환 받는 값은 Object 이기 때문에 다운캐스팅 필요
		Powder powder = (Powder)printer.getMaterial();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		System.out.println(printer2);
		
		printer2.printing();
		
		// 안 쓸 수도 있다.
		ArrayList list = new ArrayList();
	}

}
