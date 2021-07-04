package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	// arrayList 생성, 주로 Constructor 에서
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
		// id를 비교하면서 id 같은 것을 제거
//		for(int i = 0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if( memberId == tempId ) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		
		// Iterator 사용해보기 
		Iterator<Member> iterator = arrayList.iterator();
		
		// 다음 것이 있나?
		while( iterator.hasNext() ) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			
			if( memberId == tempId ) {
				// Object 를 지울 수 있다.
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 없습니다.");
		return false;
	}
	
	public void showAll() {
//		for(Member member : arrayList) {
//			System.out.println(member);
//		}
		
		Iterator<Member> iterator = arrayList.iterator();
		
		while ( iterator.hasNext() ) {
			Member member = iterator.next();
			System.out.println(member);
		}
		// 모든 것을 배열 형태로 보여준다.
//		System.out.println(arrayList);
	}
}
