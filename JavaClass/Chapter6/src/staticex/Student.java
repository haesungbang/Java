package staticex;

public class Student {

	// 외부에서 쉽게 변경하지 마라. private
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		
//		int i = 10; // 지역변수 아무 상관없다리.
//		i++;
		
		// static mehtod 내에서는 인스턴스 변수 사용할 수 없다.
		// 인스턴스가 생성될 때 생기는 건데, 인스턴스가 생성되지 않아도 메서드를 사용할 수있고, 생성되지 않는 인스턴스가??
//		studentName = "홍길동"; // 멤버변수, 인스턴스 변수 
		
		return serialNum; // static 변수 
	}	
	
}
