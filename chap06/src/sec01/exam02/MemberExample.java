package sec01.exam02;

// 외부 클래스에서 Member 필드값 읽기
public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member();

		System.out.println(member.name);
		System.out.println(member.id);
		System.out.println(member.password);
		System.out.println(member.age);
	}

}
