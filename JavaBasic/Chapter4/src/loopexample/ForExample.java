package loopexample;

public class ForExample {

	public static void main(String[] args) {

//		int num;
//		int sum;
//		
//		for(num = 1, sum = 0; num <=10; num++) {
//			sum += num;
//		}
//		System.out.println(sum);
		
		
		int dan = 2;
		int times = 1;
		
//	    for 문으로 구구단 만들기
//		for(dan = 2; dan <= 9; dan++) {
//			System.out.println(dan + "단 입니다.");
//			for(times = 1; times <= 9; times++) {
//				System.out.println(dan * times);
//			}
//			System.out.println();
		
//		while 문으로 구구단 만들기 
	    while(dan <= 9) {
	    	System.out.println(dan + "단 입니다.");
	    	
	    	while(times <= 9) {
	    		System.out.println(dan * times);
	    		times++;
	    	}
	    	
	    	dan++;
	    	times = 1;
	    	System.out.println();
		
		}
	}

}
