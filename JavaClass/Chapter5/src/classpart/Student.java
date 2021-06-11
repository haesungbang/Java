package classpart;

// class 는 대문자로 시작 
public class Student {
	// 학생이 가진 멤버변수 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	// 이것을 사용해서 클래스를 사용해보자.
	// 얘는 method 가 아니다.
	public static void main(String[] args) {
	    Student studentLee = new Student();
	    studentLee.studentName = "이순신";
	    studentLee.address = "서울시 서초구 서초동";
	    
	    studentLee.showStudentInfo();
		
	}
}
