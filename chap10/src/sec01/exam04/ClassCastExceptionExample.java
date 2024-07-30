package sec01.exam05;

// ClassCastException
public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat); // ClassCastException 발생
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
		System.out.println(dog);
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
