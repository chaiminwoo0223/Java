package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String 객체를 중복 없이 저장하는 HashSet
public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// String 객체를 저장
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		// 저장된 총 객체 수만큼 루핑
		System.out.println("총 객체 수: " + set.size());
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// 저장된 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");

		// 저장된 총 객체 수만큼 루핑
		System.out.println("총 객체 수: " + set.size());
		iterator = set.iterator(); // 반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}

		// 저장된 모든 객체를 제거
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
