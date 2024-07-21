package sec01.exam06.pack2;

import sec01.exam06.pack1.A;

// protected 접근 제한자 테스트
public class D extends A {
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
