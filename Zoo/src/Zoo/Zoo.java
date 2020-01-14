package Zoo;

public class Zoo {

    void conserveAnimal(String animal, int nrConserve) {
//        if (nrConserve > 1) {
//            System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
//        } else {
//            if (nrConserve == 0) {
//                System.out.println(animal + " nu mananca conserve");
//            }else{
//                System.out.println(animal + " mananca o conserva pe zi");
//            }
//        }

        switch (nrConserve) {
            case 0:
                System.out.println(animal + " nu mananca conserve");
                break;
            case 1:
                System.out.println(animal + " mananca o conserva zilnic");
                break;
            default:
                System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal pisica = new Animal("pisica", 3);
//        pisica.nume = "pisica";
//        pisica.nrConserve = 3;
//        pisica.setNrConserve(3);
        pisica.setNume("pisica");
        zoo.conserveAnimal(pisica.getNume(), pisica.getNrConserve());

        Animal catel = new Animal("catel", 1);
//        catel.nume = "catel";
//        catel.nrConserve = 1;
//        catel.setNume("catel");
//        catel.setNrConserve(1);
        zoo.conserveAnimal(catel.getNume(), catel.getNrConserve());


    }

}

