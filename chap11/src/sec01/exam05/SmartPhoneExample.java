package sec01.exam05;

// 객체의 문자 정보(toString()메소드)
public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString(); // 재정의된 toString() 호출
		System.out.println(myPhone);
		System.out.println(strObj);
	}
}
