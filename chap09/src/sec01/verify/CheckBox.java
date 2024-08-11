package sec01.verify;

// 중첩 인터페이스
public class CheckBox {
	// 인터페이스 타입 필드
	OnSelectListener listener;

	// 매개변수의 다형성
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	// 구현 객체의 onSelect() 메소드 호출
	void select() {
		listener.onSelect();
	}

	// 중첩 인터페이스
	static interface OnSelectListener {
		void onSelect();
	}
}
