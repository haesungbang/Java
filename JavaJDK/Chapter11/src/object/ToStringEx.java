package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ", " + author;
	}
}

public class ToStringEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("두 잇 자바", "박은종");
		System.out.println(book);
		// object.Book@5e91993f
		// toString 재정의 한후, 두 잇 자바, 박은종


		String str = new String("Test");
		System.out.println(str);
		// Test

		

	}

}
