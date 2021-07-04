package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if( len == 0 ) {
			System.out.println("Queue data 가 없습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);
	}
	
	public void showAll() {
		for(String data : arrayQueue) {
			System.out.println(data);
		}
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue();
		
		myQueue.enQueue("김유신1");
		myQueue.enQueue("김유신2");
		myQueue.enQueue("김유신3");
		
		myQueue.showAll();
		
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();

	}

}
