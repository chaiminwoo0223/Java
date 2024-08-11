package sec01.exam07;

// 중첩 클래스의 정적 멤버 허용
public class A {
	A() { System.out.println("A 객체가 생성됨"); }

	// 인스턴스 멤버 클래스
	class B {
		B() { System.out.println("B 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}

	// 정적 멤버 클래스
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		int field1; // 인스턴스 필드
		static int field2; // 정적 필드
		void method1() {} // 인스턴스 메소드
		static void method2() {} // 정적 메소드
	}

	void method() {
		// 로컬 클래스
		class D {
			D() { System.out.println("D 객체가 생성됨"); }
			int field1;
			static int field2;
			void method1() {}
			static void method2() {}
		}

		D d = new D();
		d.field1 = 3;
		d.method1();
		D.field2 = 3;
		D.method2();
	}
}
