package sec01.exam08;

//User1 스레드
public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
