package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

// String 객체를 저장하는 ArrayList
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		// 저장된 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		// 저장된 총 객체 수만큼 루핑
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		// 저장된 객체 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		// 저장된 총 객체 수만큼 루핑
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
