package absractext.animal;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog =new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//부모타입으로 객체생성 -자동 형변환
		Animal animal = null; 
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("=========");
		
		//매소드의 매개 변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}//main

	private static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}
