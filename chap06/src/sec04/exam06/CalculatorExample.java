package sec04.exam06;

// 메소드 오버로딩
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		double result1 = myCalc.areaRectangle(10);
		System.out.println("정사각형 넓이 = " + result1);

		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println("직사각형 넓이 = " + result2);
	}
}
