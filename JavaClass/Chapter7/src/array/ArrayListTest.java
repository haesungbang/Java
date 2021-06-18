package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// ArrayList<어떤 객체(타입)> 쓰지 않으면 object 로 저장된다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa2");
		list.add("aaa3");
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
