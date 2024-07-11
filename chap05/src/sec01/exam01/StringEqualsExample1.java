package sec01.exam01;

// 문자열 비교 1
public class StringEqualsExample1 {

	public static void main(String[] args) {
		String strVar1 = "최민우";
		String strVar2 = "최민우";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
	}
}
