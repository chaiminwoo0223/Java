package sec01.verify.exam05;

public class StringConvertExample {
	public static void main(String[] args) {
		// 문자열을 정수로 변환
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);

		// 정수를 문자열로 변환
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);
	}
}
