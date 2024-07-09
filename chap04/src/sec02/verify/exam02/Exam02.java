package sec02.verify.exam02;

// 주사위 2개
public class Exam02 {

	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");

			if (num1+num2 == 5) {
				break;
			}
		}
	}
}
