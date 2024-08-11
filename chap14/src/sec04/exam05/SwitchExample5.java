package sec04.exam05;

// switch문의 가드 사용
public class SwitchExample5 {
	public static void main(String[] args) {
		method(1);
		method(2);
		method(3);
		method("a");
		method("b");
		method("c");
		method(null);
	}

	private static void method(Object obj) {
		int score = switch(obj) {
		case Integer i when i == 1 -> 90;
		case Integer i when i == 2 -> 80;
		case Integer i -> 70;
		case String s when s.equals("a") -> 90;
		case String s when s.equals("b") -> 80;
		case String s -> 70;
		case null, default -> 0;
		};
		System.out.println("score: " + score);
	}
}
