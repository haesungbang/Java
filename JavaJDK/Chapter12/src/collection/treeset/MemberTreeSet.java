package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		// 이것을 해줘야 Comparator 가 불린다.
		treeSet = new TreeSet<Member>(new Member());
	}
	
	// Set 은 중복이 안 된다. 하지만 Member 의 경우, 어느 것이 같은지 모른다.
	// equals(), hashCode() 가 재정의 되어 있지 않다.
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		// Iterator 사용해보기 
		Iterator<Member> iterator = treeSet.iterator();
		
		// 다음 것이 있나?
		while( iterator.hasNext() ) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			
			if( memberId == tempId ) {
				// Object 를 지울 수 있다.
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 없습니다.");
		return false;
	}
	
	public void showAll() {

		
		Iterator<Member> iterator = treeSet.iterator();
		
		while ( iterator.hasNext() ) {
			Member member = iterator.next();
			System.out.println(member);
		}
	}
}
