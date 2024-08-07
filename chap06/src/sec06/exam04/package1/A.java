package sec06.exam04.package1;

// 필드와 메소드의 접근 제한(1)
public class A {
	// 필드
	public int field1; // public 접근 제한
	int field2; // default 접근 제한
	private int field3; // private 접근 제한

	// 생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	// 메소드
	public void method1() {} // public 접근 제한
	void method2() {} // default 접근 제한
	private void method3() {} // private 접근 제한
}
