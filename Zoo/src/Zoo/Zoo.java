package Zoo;

public class Zoo {

    void conserveAnimal(String animal, int nrConserve) {
        switch (nrConserve) {
            case 1: System.out.println(animal + " mananca o conserva zilnic"); break;
            case 0: System.out.println(animal + " nu mananca conserve"); break;
            default: System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
        }
    }

// zi   public static void main(String[] args) {
//    Zoo zoo = new Zoo();
//
//    Animal pisica = new Animal("pisica",3);
//    zoo.conserveAnimal(pisica.getNume(), pisica.getNrConserve());
//
//    Animal catel = new Animal("catel",1);
//    zoo.conserveAnimal(catel.getNume(), catel.getNrConserve());
//    }
}
