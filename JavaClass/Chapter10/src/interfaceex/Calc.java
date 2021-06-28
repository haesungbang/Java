package interfaceex;

public interface Calc {

	// 얘네는 아무것도 아니어도 public final 이다.
	// 멤버변수는 인스턴스가 생성될 때, 힙 메모리에 생성
	double PI = 3.14;
	int ERROR = -99999999;
	
	// interface 내에 하면 얘네는 추상이다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 구현코드: 재정의 가능하다.
	default void description() {
		System.out.println("계산기를 구현합니다.");
	}
	
	// 인스턴스 생성과 상관없이 사용할 수 있다.
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		return total;
		
	}
}
