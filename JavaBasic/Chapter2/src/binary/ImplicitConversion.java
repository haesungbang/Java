package binary;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		System.out.println(fNum);
		
		// num 이 float 로 형변환
		// 결과가 double 로 형변환이 일어난다.
		double dNum = fNum + num;
		System.out.println(dNum);
	}

}
