package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 둘 다 바뀐다.
		// 이유는 복사하는게 주소가 복사되는 것이기 때문에, 힙메모리가 바뀌면 같이 바뀐다.
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
		
		// 향상된 for 
	    String[] strArr = {"Java", "Android", "C"};
	   
	    // 처음부터 끝까지 다 돌 것 이라면!
	    for(String s : strArr) {
	    	System.out.println(s);
	    }
	    
	    int[] numbers = {1, 2, 3, 4, 5};
	    for(int i : numbers) {
	    	System.out.println(i);
	    }
	    
	}

}
