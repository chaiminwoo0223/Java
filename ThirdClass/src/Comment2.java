public class Comment2 {
    public static void main(String[] args) {
        try {
            // zero 메서드를 호출하고 10을 0으로 나누려고 시도한다.
            zero(10, 0);
        } catch (ArithmeticException e) {
            // ArithmeticException이 발생하면, 해당 예외를 처리하고 에러 메시지를 출력한다.
            System.out.println("ArithmeticException 발생: " + e.getMessage());
        }
    }

    // zero 메서드는 두 정수를 받고, 두 번째 정수가 0일 경우 ArithmeticException 예외를 발생시킨다.
    public static void zero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // 두 번째 정수가 0이면, 예외를 발생시킨다.
            throw new ArithmeticException("0 으로 나눌 수 없습니다.");
        }
        // 두 정수를 나눈 결과를 계산하고 출력한다.
        int result = a / b;
        System.out.println("나눈 결과: " + result);
    }
}
