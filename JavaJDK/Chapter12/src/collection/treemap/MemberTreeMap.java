package collection.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		// containsKey 값이 hashMap 안에 있느냐?
		if( treeMap.containsKey(memberId)) {
			// get 은 가져오기
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 없습니다.");
		return false;
	}
	
	public void showAll() {
		// ir 은 키 값 하나인듯?
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		
	}
}
