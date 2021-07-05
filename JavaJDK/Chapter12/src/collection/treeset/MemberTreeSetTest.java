package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		// TreeSet 은 Comparable 을 재정의 해줘야된다. String 이 아닌 경우
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberLee2 = new Member(102, "이순신2");
		Member memberLee3 = new Member(103, "이순신3");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberLee2);
		memberTreeSet.addMember(memberLee3);
		
		memberTreeSet.showAll();
		

	}

}
