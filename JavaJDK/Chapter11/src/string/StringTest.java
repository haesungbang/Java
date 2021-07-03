package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		// 주소가 같은지 검사 => false
//		System.out.println(str1 == str2);
//		
//		String str3 = "abc";
//		String str4 = "abc";
//		
//		// true 같은 상수를 가리킨다.
//		System.out.println(str3 == str4);
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		// 1651191114
		
		// String 내에 value 는 final 로 되어 있어서 재정의가 안된다.
		// 따라서 새로운 메모리?에 저장
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));
		//1579572132

		System.out.println(str1);

	}

}
