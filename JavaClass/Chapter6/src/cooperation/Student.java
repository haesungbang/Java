package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	// 생성자 
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// bus 타는 method 
	// bus 를 탔을 때, bus 정보가 필요하다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(2000);
		money -= 2000;
		
	}
    
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money);
	}
}
