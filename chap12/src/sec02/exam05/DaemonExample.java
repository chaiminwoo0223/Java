package sec02.exam05;

// 메인 스레드가 실행하는 코드
public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 데몬 스레드
		autoSaveThread.start();

		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		System.out.println("메인 스레드 종료");
	}
}
