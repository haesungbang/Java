package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		// containsKey 값이 hashMap 안에 있느냐?
		if( hashMap.containsKey(memberId)) {
			// get 은 가져오기
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 없습니다.");
		return false;
	}
	
	public void showAll() {
		// ir 은 키 값 하나인듯?
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
	}
}
