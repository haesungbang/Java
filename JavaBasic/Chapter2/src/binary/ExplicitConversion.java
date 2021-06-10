package binary;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		// -128~ 127 값을 표현한다. 1바이트 
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		// 1000
		System.out.println(bNum);
		// -24
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		// 3
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		System.out.println(num1);
		// 3
		System.out.println(num2);
		// 4

	}

}
