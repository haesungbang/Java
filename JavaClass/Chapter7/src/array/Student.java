package array;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	// 학생이 듣는 과목 
	private ArrayList<Subject> subjectList;
	
    public Student(int studentID, String studentName) {
    	this.studentID = studentID;
    	this.studentName = studentName;
    	
    	subjectList = new ArrayList<Subject>();
    	
    }
    
    // 과목 넣는 함수 
    public void addSubject(String name, int score) {
    	Subject subject = new Subject();
    	subject.setName(name);
    	subject.setScore(score);
    	
    	subjectList.add(subject);
    }
	
    public void showStudentInfo() {
    	int total = 0;
    	for(Subject subject : subjectList) {
    		total += subject.getScore();
    		System.out.println(studentName + "의 " + subject.getName() + " 성적은 " + subject.getScore());
    	}
    	System.out.println(total);
    }
}
