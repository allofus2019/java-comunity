package workshop2;

import Zoo.Animal;

public class Dog extends Animal {

    public Dog(String nume, int nrConserve) {
        super(nume, nrConserve);
    }

    public Dog(String nickname) {
        super("",0);
    }

    @Override
    public void action(){
//        super.action();
        System.out.println("Cainele canta");
    }

    public void action(int pasi){
        System.out.println("Cainele a facut " + pasi + " pasi");
    }

    public void showAnimal(Animal animal) {
        animal.action();
    }

//    @Override
//    public void nrPicioare(int nr) {
//        System.out.println("Cainele are " + nr + "picioare");
//    }

    public static void main(String[] args) {
        Dog dog = new Dog("doggo",20);
        dog.action(20);

        Animal animal = new Animal("girafa",20);
        Animal dogg = new Dog("Doggo", 20);

        animal.action();
        dog.action();
//        dogg.action(20); ---->> error

        System.out.println("----------------");

        dog.showAnimal(animal);
        dog.showAnimal(dog);
        ((Dog)dogg).action(20);
    }
}
