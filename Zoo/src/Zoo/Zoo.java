package Zoo;

public class Zoo {

    void conserveAnimal(String animal, int nrConserve) {
        switch(nrConserve) {
            case 1: System.out.println(animal + " mananca o conserva pe zi"); break;
            case 0: System.out.println(animal + " nu mananca deloc conserve"); break;
            default: System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
        }
        //
        // if (nrConserve > 1) {
        //     System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
        // } else if (nrConserve > 0) {
        //     System.out.println(animal + " mananca o conserva pe zi");
        // } else {
        //     System.out.println(animal + " nu mananca deloc conserve");
        // }
    }

    static void conserveAnimal(Animal animal) {
        switch(animal.getNrConserve()) {
            case 1: System.out.println(animal.getNume() + " mananca o conserva pe zi"); break;
            case 0: System.out.println(animal.getNume() + " nu mananca deloc conserve"); break;
            default: System.out.println(animal.getNume() + " mananca " + animal.getNrConserve() + " conserve pe zi");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal pisica = new Animal("pisica", 2);
        conserveAnimal(pisica);

        String catel = "catelul";
        int nrConserveCatel = 1;
        zoo.conserveAnimal(catel, nrConserveCatel);

        String cal = "calul";
        int nrConserveCal = 0;
        zoo.conserveAnimal(cal, nrConserveCal);

    }
}
