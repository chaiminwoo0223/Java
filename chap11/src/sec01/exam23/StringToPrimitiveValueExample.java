package sec01.exam23;

// 문자열을 기본 타입 값으로 변환
public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
