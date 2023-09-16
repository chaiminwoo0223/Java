public class Functional_Interface {
    public static void main(String[] args) {
        /*Myfunction f = new Myfunction(){
        public int max(int a, int b){
        return a>b?a:b; }
        }; */
        //람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로한다.
        Myfunction f = (a,b)-> a>b?a:b; //위의 주석처리된 식을 람다식으 변환한다.
        // #함수형 인터페이스와 반환타입과 개수가 맞다면 내용은 바꿔서 사용할 수 있다.
        int value = f.max(3,5);
        System.out.println(value);
    }
}

@FunctionalInterface
interface Myfunction{
    public abstract int max(int a, int b);
}
