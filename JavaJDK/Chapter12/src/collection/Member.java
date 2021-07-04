package collection;

public class Member {

	private int memberId;
	private String memberName;
	
	// Constructor
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
}
