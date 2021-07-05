package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		
		// String 은 기본적으로 Comparable 이 이미 구현되어 있어서 된다.
		// 다른 것의 경우 구현을 해줘야한다.
		System.out.println(tree);
	}

}
