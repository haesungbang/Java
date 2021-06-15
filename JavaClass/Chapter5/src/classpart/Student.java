package classpart;

// class 는 대문자로 시작 
public class Student {
	// 학생이 가진 멤버변수 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 기본은 public Student() {}
	// 인자도 변수도 없다 생성 안 해도 Default 값이 생
//	public Student(int id, String name) {
//		studentID = id;
//		studentName = name;
//	}
	// 반환값이 없는 경우 void 를 사용한다. 
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	// 메서드 
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	// main 은 객체를 구성하는게 아니여서 다른데 있어도 노상관.
	public static void main(String[] args) {
		
		// 힙에 저장??
		// 참조형 데이터타입, 참조형 변수?
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
	    studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구";
		
	    Student studentKim = new Student();
	    studentKim.studentName = "김유신";
	    studentKim.studentID = 101;
	    studentKim.address = "미국";
		
	   studentLee.showStudentInfo();
	   studentKim.showStudentInfo();
	   
	}
	// 이것을 사용해서 클래스를 사용해보자.
	// 얘는 method 가 아니다.
	
//	public static void main(String[] args) {
//	    Student studentLee = new Student();
//	    studentLee.studentName = "이순신";
//	    studentLee.address = "서울시 서초구 서초동";
//	    
//	    studentLee.showStudentInfo();
//		
//	}
}
