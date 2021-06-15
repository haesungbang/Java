package singleton;

public class Company {

 // 유일하게 생성되는 객체 
    private static Company instance = new Company();
    
 // 외부에서 함부로 접근하지 못하게 하겠다.
	private Company(){}
	
	// 객체를 생성하지 않아도 부를 수 있도록 static 사용?
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
