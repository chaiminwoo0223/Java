package sec02.verify.exam05;

// 별찍기 2
public class Exam05 {

	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
