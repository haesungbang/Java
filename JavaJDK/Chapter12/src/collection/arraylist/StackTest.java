package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	
	// 뒤에 안 써도 상관없다. 요즘에는 추론해서 넣어준다. 
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len = arrayStack.size();
		if(len == 0 ) {
			System.out.println("데이터가 없습니다.");
			return null;
		}
		
		// python 과 달리 index 는 -1 값을 가질 수 없네?
		return arrayStack.remove(len - 1);
	}
	
	// remove 와 달리 peek 은 그냥 보는 것.
	public String peek() {
		int len = arrayStack.size();
		if(len == 0 ) {
			System.out.println("데이터가 없습니다.");
			return null;
		}
		
		return arrayStack.get(len - 1);
	}
	
}
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack();
		
		myStack.push("이순신1");
		myStack.push("이순신2");
		myStack.push("이순신3");
		
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());

	}

}
