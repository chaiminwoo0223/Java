package sec04.exam04;

import java.util.Date;

// switch문의 타입 매칭
public class SwitchExample4 {
	public static void main(String[] args) {
		method(10); // 매개값은 Integer 객체로 자동 박싱
		method("10"); // 매개값은 String 객체로 자동 박싱
		method(null); // 매개값은 null
		method(new Date()); // 매개값은 Date 객체
	}

	public static void method(Object obj) {
		switch(obj) {
		case Integer i -> System.out.println(i);
		case String s -> System.out.println("\"" + s + "\"");
		case null, default -> System.out.println("unknown");
		}
	}
}
