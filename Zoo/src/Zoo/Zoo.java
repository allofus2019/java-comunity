package Zoo;

public class Zoo {

      void conserveAnimal(String animal, int nrConserve){

        switch (nrConserve){
            case 1: System.out.println(animal + " mananca o conserva zilnic"); break;
            case 0: System.out.println(animal + " nu mananca conserve");break;
            default:
                System.out.println(animal + " mananca " + nrConserve +" conserve pe zi");
        }
//        if(nrConserve>1){
//            System.out.println( animal +" mananca "+ nrConserve + " conserve pe zi");
//        }else {
//            if(nrConserve == 0){
//                System.out.println(animal+ " nu mananca conserve");
//            }
//            else{
//            System.out.println(animal + " mananca o conserva zilnic ");
//            }
//        }
    }

    public static void main(String[] args) {
          Zoo zoo= new Zoo(); //instantierea clasei pentru a folosi metodele din ea (doar fara a folosi "static")

        Animal pisica= new Animal("pisica", 1);
       // pisica.setNume("pisica");
      //  pisica.nume= "pisica";
        //pisica.nrConserve=3;
      //  pisica.setNrConserve(3);
     //   String pisica = "pisica"; // asigneaza o valoare variabilei
       // int nrConservePisica = 0; // asigneaza o valoare variabilei
       // zoo.conserveAnimal(pisica.nume, pisica.nrConserve); // apelarea metodei
        zoo.conserveAnimal(pisica.getNume(), pisica.getNrConserve()); // apelarea metodei
        Animal catel = new Animal("catel", 3);
      //  catel.setNume("catel");
        //catel.nume="catel";
     //   catel.setNrConserve(1);
      //  catel.nrConserve= 1;
       // zoo.conserveAnimal(catel.nume,catel.nrConserve );
        zoo.conserveAnimal(catel.getNume(), catel.getNrConserve()); // apelarea metodei
    }

}
