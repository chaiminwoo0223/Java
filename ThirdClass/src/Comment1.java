import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Comment1 {
    public static void main(String[] args) {
        List<String> it = Arrays.asList(
                "C", "Java", "C++", "Python", "Kotlin"
        );

        // Optional로 itlist를 래핑한다.
        Optional<List<String>> itlist = Optional.of(it);

        // Optional의 map 메서드를 사용하여 리스트의 크기를 가져온 후, 만약 값이 존재하지 않는다면 0을 기본값으로 설정한다.
        int sum = itlist
                .map(List::size)  // 리스트의 크기를 가져온다.
                .orElse(0); // 값이 없다면 0을 기본값으로 사용한다.
        System.out.println(sum);  // 결과를 출력한다.
    }
}