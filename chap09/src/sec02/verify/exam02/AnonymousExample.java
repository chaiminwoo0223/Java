package sec02.verify.exam02;

// 익명 구현 클래스와 객체 생성
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				});
	}
}
