package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet();
		
		set.add("김유신1");
		set.add("김유신12");
		set.add("김유신123");
		
		// 순서대로 안 나온다.
		System.out.println(set);
		
		set.add("김유신1");
		// 중복이 허용되지 않는다.
		// String 은 equals() 가 구현되어 있어서, 글자가 같으면 중복으로 친다.
		System.out.println(set);

		

	}

}
