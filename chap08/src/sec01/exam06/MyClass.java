package sec01.exam06;

import sec01.exam03.RemoteControl;
import sec01.exam04.Audio;
import sec01.exam04.Television;

// 인터페이스 사용
public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 생성자1
	MyClass() {

	}

	// 생성자2
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	// 메소드1
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

	// 메소드2
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
