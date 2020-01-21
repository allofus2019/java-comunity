package workshop2;

import Zoo.Animal;

public class Dog  extends Animal {

    public Dog(String nume, int nrConserve) {
        super(nume, nrConserve);
    }

    public Dog(String nickname){
        super("", 2);
    }

    @Override
    public void action() {
        //super.action();
        System.out.println("Cainele canta");
    }
    public void action (int pasi){
        System.out.println("Cainele a facut "+pasi+ " pasi");
    }
    public void showAnimal(Animal animal){
      //  System.out.println("My name is "+ animal.action()):
        animal.action();
    }

   /* @Override
    public void nrPicioatre(int nr) {
        System.out.println("Cainele are "+nr+" picioare");
    }
*/


    public static void main(String[] args) {
      Dog dog= new Dog("Doggo", 20);
        dog.action(20);

        Dog doggo = new Dog("doggo");
      Animal animal = new Animal("girafa",20);
        doggo.action();
        System.out.println("---------");
     dog.showAnimal(animal);
     dog.showAnimal(doggo);
        ((Dog)doggo).action(20);


    }
}
