package sec02.exam04;

// 무한 반복해서 출력하는 스레드
public class PrintThread3 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
