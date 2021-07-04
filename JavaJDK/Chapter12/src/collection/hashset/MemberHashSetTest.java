package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberLee2 = new Member(101, "이순신2");
		Member memberLee3 = new Member(103, "이순신3");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberLee2);
		memberHashSet.addMember(memberLee3);
		
		memberHashSet.showAll();
		memberHashSet.removeMember(101);
		memberHashSet.showAll();
		memberHashSet.removeMember(104);

	}

}
