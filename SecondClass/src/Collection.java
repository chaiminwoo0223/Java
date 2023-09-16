import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        ArrayList<String> in = new ArrayList<String>();
        in.add("sangjin"); // sangjin 이라는 요소 추가
        in.clear(); //요소 지우기
        // HashSet 객체 생성
        Set<Integer> num= new HashSet<Integer>();
        num.add(20); // 20 이라는 요소 추가
        // HashMap 객체 생성
        Map<String, Integer> hash = new HashMap<>();
        hash.put("학번",20); //key 값과 value 값 입력
    }
}
