public class Hello2030 {
    public static void main(String[] args) {
        tansan a = new tansan(); // tansan 의 클래스를 a 참조변수에 인스턴스화

        a.name = "콜라"; // 맴버변수에 데이터를 저장
        a.price = 1500;
        a.showPrice();
    }
}
class tansan{
    String name;
    int price;

    public tansan(){

    }
    public void showPrice(){
        System.out.println(name+"의 가격은 "+price+"원 입니다.");
    }
}
