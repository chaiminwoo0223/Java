public class Introduce1 {
    public static void main(String[] args) {
        Person p1 = new Person("최민우", 24);
        Person p2 = new Person("최은하", 22);

        p1.introduce();
        p2.introduce();

    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("제 이름은 "+name+"이고 나이는 "+age+"입니다.");
    }
}

