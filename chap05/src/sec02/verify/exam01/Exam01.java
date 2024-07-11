package sec02.verify.exam01;

// 최댓값
public class Exam01 {

	public static void main(String[] args) {
		int max = 0;
		int[] elements = { 1, 5, 3, 8, 2 };

		for (int element : elements) {
			if (max < element) {
				max = element;
			}
		}
		System.out.println("max: " + max);
	}
}
