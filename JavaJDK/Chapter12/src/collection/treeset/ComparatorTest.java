package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.compareTo(str2) * (-1);
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		
		// String 은 기본적으로 Comparable 이 이미 구현되어 있어서 된다.
		// 다른 것의 경우 구현을 해줘야한다.
		System.out.println(tree);
	
	}

}
