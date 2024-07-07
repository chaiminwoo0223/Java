package sec04.exam06;

import java.util.Scanner;

// Scanner를 이용해서 이름, 주민번호, 전화번호를 키보드에서 입력하고 출력하기
public class ScannerExample2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();
		String social_security_number = scanner.nextLine();
		String phone_number = scanner.nextLine();

		System.out.printf("이름: %s\n", name);
		System.out.printf("주민번호 앞 6자리: %s\n", social_security_number);
		System.out.printf("전화번호: %s\n", phone_number);
	}
}
