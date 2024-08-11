package sec02.exam01;

// 가독성 나쁨
public class VarExample1 {
	public static void main(String[] args) {
		String x = getData();
		var y = getData();
	}

	public static String getData() {
		return "홍길동";
	}
}
