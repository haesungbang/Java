package assignment;

public class OperationEX3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) > 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// 앞에서 false 여서 뒤에 것을 연산하지 않았다.

		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) > 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// 앞에서 true 여서 뒤에 것을 연산하지 않았다.
		
	}

}
