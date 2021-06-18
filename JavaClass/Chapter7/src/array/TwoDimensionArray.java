package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3];
//		
//		System.out.println(arr.length); // 2
//		System.out.println(arr[0].length); // 3
//		
//        int[][] brr = {{1, 2, 3}, {4, 5, 6}};
//		
//		System.out.println(brr.length); // 2
//		System.out.println(brr[0].length); // 3
//		
//		for(int i = 0; i < brr.length; i++) {
//			for(int j = 0; j < brr[0].length; j++) {
//				System.out.println(brr[i][j]);
//			}
//		}
		
		char[][] alphabets = new char[13][2];
		for(int k = 0; k < 13; k++) {
			for(int l = 0; l < 2; l++) {
				alphabets[k][l] = (char)(65 + (2*k) + l);
				System.out.println(alphabets[k][l]);
			}
		}
	}

}
