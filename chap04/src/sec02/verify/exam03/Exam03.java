package sec02.verify.exam03;

// 	4x + 5y = 60
public class Exam03 {

	public static void main(String[] args) {
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (4*x+5*y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
