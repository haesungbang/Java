package collection.hashmap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(101, "이순신");
		Member memberLee2 = new Member(102, "이순신2");
		Member memberLee3 = new Member(103, "이순신3");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberLee2);
		memberHashMap.addMember(memberLee3);
		
		memberHashMap.showAll();
		
		memberHashMap.removeMember(104);
		
		memberHashMap.showAll();

	}

}
