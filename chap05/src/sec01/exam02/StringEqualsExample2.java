package sec01.exam02;

// 문자열 비교 2
public class StringEqualsExample2 {

	public static void main(String[] args) {
		String strVar3 = new String("최민우");
		String strVar4 = new String("최민우");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
