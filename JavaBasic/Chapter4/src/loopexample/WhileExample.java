package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
//		while(num <= 10) {
//			
//			sum += num;
//			num++;
//		}
		
		// do while 문은 조건이 false 여도 무조건 한 번은 실
		do {
			sum += num;
			num++;
		}while(num < 1);
		
		System.out.println(sum);
	}

}
