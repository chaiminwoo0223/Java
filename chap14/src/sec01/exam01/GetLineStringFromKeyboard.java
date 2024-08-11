package sec01.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 키보드로부터 라인 단위 문자열 얻기
public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine(); // 라인 단위로 문자열 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.println("입력된 내용: " + lineStr);
			System.out.println();
		}
		br.close();
	}
}
