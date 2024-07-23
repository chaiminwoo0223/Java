package sec03.exam01;

// 실행 클래스
public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // 컴파일 에러
		SmartPhone smartPhone = new SmartPhone("최민우");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
