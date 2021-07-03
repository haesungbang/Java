package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 다운캐스팅
		if( obj instanceof Student ) {
			Student std = (Student)obj;
			
			if(studentID == std.studentID) 
				return true;
			else
				return false;
		}
		return false;
	}
	
	// hashCode 재정의
	// equals 의 가져다 쓴 멤버변수 가져다 쓰면 편하다.
	public int hashCode() {
		return studentID;
	}
}


public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);
		// false
		System.out.println(str1.equals(str2));
		// true
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		// false
	    System.out.println(std1.equals(std2));
	    // false
	    
	    // 값이 다르다.
	    System.out.println(std1.hashCode());
	    System.out.println(std2.hashCode());


	}

}
