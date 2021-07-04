package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "이순신");
		Member memberLee2 = new Member(102, "이순신2");
		Member memberLee3 = new Member(103, "이순신3");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberLee2);
		memberArrayList.addMember(memberLee3);
		
		memberArrayList.showAll();
		memberArrayList.removeMember(101);
		memberArrayList.showAll();
		memberArrayList.removeMember(104);


		
	}

}
