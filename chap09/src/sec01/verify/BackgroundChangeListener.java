package sec01.verify;

// 구현 클래스
public class BackgroundChangeListener implements CheckBox.OnSelectListener {
	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}
