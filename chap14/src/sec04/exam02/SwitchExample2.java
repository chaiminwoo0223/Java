package sec04.exam02;

// switch문의 단일값 리턴
public class SwitchExample2 {
	public static void main(String[] args) {
		method1();
		method2();
	}

	// 전통적인 방식
	public static void method1() {
		String grade = "B";
		int score; // switch문 바깥쪽에 변수 선언

		switch(grade) {
		case "A":
			score = 100;
			break;
		case "B":
			int result = 100 - 20;
			score = result;
			break;
		default:
			score = 60;
		}
		System.out.println("score: " + score);
	}

	// 변수를 선언하고 switch문이 리턴하는 값으로 초기화
	public static void method2() {
		String grade = "B";

		int score = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score: " + score);
	}
}
