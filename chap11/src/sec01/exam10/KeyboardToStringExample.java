package sec01.exam10;

import java.io.IOException;

// 바이트 배열을 문자열로 변환
public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo-1);
		System.out.println(str);
	}
}
