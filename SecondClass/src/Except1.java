public class Except1 {
    public static void main(String[] args) {
        int a=0;
        int b=12;
        try { //예외가 발생할 문장에 사용
            System.out.print(b/a);
        }
        catch(Exception e) { // 예외가 발생했을 시 catch 안의 문장이 실행
            System.out.println("예외발생!");
        }
        finally { //예외가 발생하건 발생하지 않건 공통으로 수행되어야 할 코드가 쓰임. 생략 가능
            System.out.println("난 반드시 실행돼");
        }
    }
}
