package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		// 같은 값을 가진다.
		System.out.println(c1);
		System.out.println(c2);
		
		// 문제를 낸다면
//	    Company c3 = new Company(); // error
//	    System.out.println(c1 == c2); // true
		
	}

}
