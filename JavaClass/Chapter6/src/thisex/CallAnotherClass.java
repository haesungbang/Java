package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
//		name = "이름없음";
//		age = 1;
		
		// 여기서 this 는 아래에 생성 Person 을 의미한다.
		// 생성자 안에서 this 를 호출할 때는 앞에 아무것도 올 수 없다.
		// name = "test"; 이런거 올 수 가 다.
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}


public class CallAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
	    System.out.println(p1.name);

	    System.out.println(p1.returnSelf());
	}

}
