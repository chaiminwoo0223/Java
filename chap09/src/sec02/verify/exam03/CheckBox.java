package sec02.verify.exam03;

// UI 클래스
public class CheckBox {
	// 인터페이스 타입 필드
	OnClickListener listener;

	// 매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// 구현 객체의 onClick() 메소드 호출
	void select() {
		listener.onClick();
	}

	// 중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}
