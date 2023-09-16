import java.util.Scanner;
// 별찍기
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 정수 입력받기

        for(int i=1; i<n+1;i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
