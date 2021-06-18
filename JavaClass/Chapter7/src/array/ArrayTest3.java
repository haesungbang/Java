package array;

public class ArrayTest3 {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A'; //65
//		System.out.println(ch+1); // 66
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch; //ASCII 값으로 저장한다.
		}
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
		
//		int num = 65;
//		char alpha = (char)num;
//		System.out.println(alpha);
		
	}

}
