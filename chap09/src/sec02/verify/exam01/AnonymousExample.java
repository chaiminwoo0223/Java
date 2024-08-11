package sec02.verify.exam01;

// 익명 구현 클래스와 객체 생성
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(
				new Worker() {
					@Override
					public void start() {
						System.out.println("테스트를 합니다.");
					}
				});
	}
}
