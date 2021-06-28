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
}
