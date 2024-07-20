package sec06.exam04.package2;

import sec06.exam04.package1.A;

// 필드와 메소드의 접근 제한(3)
public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // 컴파일 에러
//		a.field3 = 1; // 컴파일 에러

		a.method1();
//		a.method2(); // 컴파일 에러
//		a.method3(); // 컴파일 에러
	}
}
