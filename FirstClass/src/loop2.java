public class loop2 {
    public static void main(String[] args) {
        int i=0;
        int a=0;
        while(a<10){
            i+=a;
            a++; //이 문장이 없다면 무한루프에 빠진다.
        }
        System.out.print(i);
    }
}
