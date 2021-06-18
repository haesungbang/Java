package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// new int[] 안에 수를 안 넣고 뒤에 {0, 1, 2} 넣으면 개수 3으로 된다.
//		int[] numbers = new int[]{0, 1, 2};
//		System.out.println(numbers.length);
		int[] numbers;
		numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
