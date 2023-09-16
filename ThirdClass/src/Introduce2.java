public class Introduce2 {
    public static void main(String[] args) {
        Student st = new Student("최민우", 24, 3.92);
        st.introduce();
    }
}
class Student extends Person{
    double gpa;
    public Student(String name, int age, double gpa){
        super(name, age); // 부모 클래스(Person)의 생성자 호출
        this.gpa = gpa;
    }

    @Override
    public void introduce() {
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "입니다. 학점은 " + gpa + " 입니다.");
    }
}
