public class Except2 {
    public static void main(String[] args) {
        try {
            zero(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생: " + e.getMessage());
        }
    }
    public static void zero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("0 으로 나눌 수 없습니다.");
        }
        int result = a / b;
        System.out.println("나눈 결과: " + result);
    }
}
