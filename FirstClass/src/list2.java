public class list2 {
    public static void main(String[] args) {
        int [] score = { 75, 80, 95, 90};
        int sum=0;
        for(int a=0; a<score.length; a++){
            sum += score[a];
        }
        System.out.print(sum);
    }
}
