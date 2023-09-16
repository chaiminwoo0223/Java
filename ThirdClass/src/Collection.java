import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        // ArrayList<Person> 객체 생성
        ArrayList<Person> personList = new ArrayList<>();
        // Person 객체를 생성하고 ArrayList에 추가
        Person p1 = new Person("최하늘", 22);
        Person p2 = new Person("최바다", 20);
        Person p3 = new Person("최은하", 18);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        // ArrayList에 든 요소 모두 출력
        for (Person person : personList) {
            person.introduce();
        }
        System.out.println();
        // 추가문제 : age 가 20 이상인 요소만 출력하는 문장 추가
        personList.stream().filter(person -> person.age >= 20).forEach(Person::introduce);
    }
}