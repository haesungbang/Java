package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(101, "이순신");
		Member memberLee2 = new Member(102, "이순신2");
		Member memberLee3 = new Member(103, "이순신3");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberLee2);
		memberTreeMap.addMember(memberLee3);
		
		memberTreeMap.showAll();
		
		memberTreeMap.removeMember(104);
		
		memberTreeMap.showAll();

	}

}
