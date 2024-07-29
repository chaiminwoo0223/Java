package sec02.verify.exam03;

// 실행 클래스
public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnClickListener(new CheckBox.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBox.select();
	}
}
