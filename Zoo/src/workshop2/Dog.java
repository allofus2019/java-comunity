package workshop2;

import Zoo.Animal;

public class Dog extends Animal {

	public Dog(String nume, int nrConserve) {
		super(nume, nrConserve);
	}
	
	public Dog(String nickname){
		super("", 0);
	}
	
	@Override
	public void action(){
//		super.action();
		System.out.println("Cainele canta");
	}
	
	public void action(int pasi){
		System.out.println("Cainele a facut "+pasi+" pasi");
	}
	
	public void showAnimal(Animal animal){
		animal.action();
	}

//	@Override
//	public void nrPicioare(int nr) {
//		System.out.println("Cainele are "+nr+" picioare");
//	}

	public static void main(String[] args) {
		Dog doggo = new Dog("Doggo", 20);
		doggo.action(20);
		
		Animal animal = new Animal("girafa", 20);
		Animal dog = new Dog("doggo", 30);
		
		animal.action();
		dog.action();

		System.out.printf("----------");
		doggo.showAnimal(animal);
		doggo.showAnimal(dog);
		((Hospital)dog).action(20);
		
//		dog.action(20);
	}
}
