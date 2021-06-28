package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	// 자료구조를 가지고 있다.
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
	

}
