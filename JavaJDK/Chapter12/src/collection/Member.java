package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberId;
	private String memberName;
	
	// Constructor
	
	public Member(){} 
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// getter, setter
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// 출력값 설정
	public String toString() {
		return memberName + ", " + memberId;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else {
				return false;
			}
		}
		// 멤버가 아니면
		return false;
	}

	// Comparable
	@Override
	public int compareTo(Member member) {
		// memberId 로 비교해보자.
		// 내가 더 컸을 때, return 값이 양수면 오름차순으로 정
		// 작으면 내림차순
//		return (this.memberId - member.memberId);
		
		// 이름으로 비교
		return (this.memberName.compareTo(member.memberName)) * (-1);
	}

	// Comparator
	@Override
	// 앞에 것이 나, 뒤에가 비교할 것.
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
	
}
