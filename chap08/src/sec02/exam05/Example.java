package sec02.exam05;

// 호출 가능 메소드
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
