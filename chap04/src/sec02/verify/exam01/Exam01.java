package sec02.verify.exam01;

// 1부터 100까지의 정수 중에서 3의 배수의 총합
public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i=1; i<=100; i++) {
			if (i%3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
