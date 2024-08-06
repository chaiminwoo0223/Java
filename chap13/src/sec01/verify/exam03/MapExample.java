package sec01.verify.exam03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 점수 관리
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			int score = entry.getValue();
			totalScore += score;
			if(score > maxScore) {
				maxScore = score;
				name = entry.getKey();
			}
		}
		System.out.println("평균점수: " + (totalScore / map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
