package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		// null
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1", "조정");
		library[1] = new Book("태백산맥2", "조정");
		library[2] = new Book("태백산맥3", "조정");
		library[3] = new Book("태백산맥4", "조정");
		library[4] = new Book("태백산맥5", "조정");
		
		// 담긴 주소가 찍힌다.
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i<library.length; i++) {
			library[i].showInfo();
		}
	}

}
