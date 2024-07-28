package sec01.exam03;

// 멤버 클래스에서 사용 제한
public class A {
	int field1; // 인스턴스 필드
	void method1() {} // 인스턴스 메소드
	static int field2; // 정적 필드
	static void method2() {} // 정적 메소드

	// 인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10;
			method1();
			field2 = 10;
			method2();
		}
	}

	// 정적 멤버 클래스
	class C {
		void method() {
//			field1 = 10;
//			method1();
			field2 = 10;
			method2();
		}
	}
}
