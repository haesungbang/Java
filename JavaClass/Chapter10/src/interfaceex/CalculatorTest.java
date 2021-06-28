package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		// Calc type을 상속한다.
		// type에 선언된, Calc 에 있는 것들만 가져와서 오버라이딩? 구현하고 사용.
		// showInfo 는 CompleteCalc 에 있어서 사용 불가능!
		// 사용하려면 type 을 CompleteCalc 로 해야된다. 
		Calc calc = new CompleteCalc();
		
		// 추상이기 때문에 new 인스턴스 생성 x
		// Calc calc1 = new Calc();
		
		System.out.println(calc.add(num1, num2));
	}

}
