package sec01.exam01;

// 자식 클래스 사용
public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// CellPhone 클래스로부터 상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		// DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		// CellPhone 클래스로부터 상속 받은 매소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 최민우입니다.");
		dmbCellPhone.sendVoice("아! 예 반갑습니다.");
		dmbCellPhone.hangUp();

		// DmbCellPhone 클래스의 매소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
