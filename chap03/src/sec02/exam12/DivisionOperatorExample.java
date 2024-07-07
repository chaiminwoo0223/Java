package sec02.exam12;

import java.util.Scanner;

// 나누기 연산자
public class DivisionOperatorExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		String strNum1 = scanner.next();
		double num1 = Double.parseDouble(strNum1);

		System.out.print("두 번째 수: ");
		String strNum2 = scanner.next();
		double num2 = Double.parseDouble(strNum2);

		System.out.println("---------------");
		if (num2 != 0.0) {
			System.out.println("결과: " + (num1/num2));
		} else {
			System.out.println("결과: 무한대");
		}
	}
}
