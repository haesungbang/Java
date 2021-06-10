package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		
		// 둘 다 똑같지만, 0에서 부터 시작하는 것을 권장.
		for(int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("HelloWorld");
		}
		
	}

}
