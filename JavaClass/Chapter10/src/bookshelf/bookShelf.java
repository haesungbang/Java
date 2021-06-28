package bookshelf;

public class bookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	// 맨 앞에 것을 뺀다.
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
