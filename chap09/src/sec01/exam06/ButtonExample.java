package sec01.exam06;

// 버튼 이벤트 처리
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();

		// 전화
		btn.setOnClickListener(new CallListener());
		btn.touch();

		// 메시지
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
