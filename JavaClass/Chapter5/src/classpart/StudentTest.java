package classpart;

public class StudentTest {
	// main Student가 아니라 다른 곳에 써도 노상관.
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
	   
	   System.out.println(studentLee);
	}
}
