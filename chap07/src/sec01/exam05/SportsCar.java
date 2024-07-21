package sec01.exam05;

// 재정의할 수 없는 final 메소드
public class SportsCar extends Car {

	@Override
	public void speedUp() { speed += 10; }
}
