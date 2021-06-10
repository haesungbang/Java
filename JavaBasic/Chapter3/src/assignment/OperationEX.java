package assignment;

public class OperationEX {

	public static void main(String[] args) {

		// 대입연산자는 우선순위가 가장 낮다.
		int age = 24;
		System.out.println(age);
		
		// 부호연산자 
		int num = 10;
		int num2 = -num;
		System.out.println(num);
		System.out.println(num2);
		
		// 대입을 해야 바뀐다. 
		num = -num;
		System.out.println(num);

	}

}
