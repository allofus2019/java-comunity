package Zoo;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Zoo {

     void conserveAnimal(String animal, int nrConserve){


     //   if(nrConserve>1) {
         //   System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
      //  }
      //  else{
         //   if(nrConserve == 0)
          //  {
          //      System.out.println(animal + " nu mananca o conserva zilnic");
          //  }
           // else{
            //    System.out.println(animal + " mananca o conserva zilnic"); System.out.println(animal + " mananca o conserva zilnic");
          //  }

    switch (nrConserve){
    case 1:  System.out.println(animal + " mananca o conserva zilnic"); break;
    case 0:  System.out.println(animal + " nu mananca conserve ");break;
    default:  System.out.println(animal + " mananca " + nrConserve + " conserve pe zi");
}

    //}
    }

    public static void main(String[] args){
        Zoo zoo = new Zoo();
//cand e cls private
      /*  Animal pisica = new Animal();
        pisica.setNume("pisica");
        pisica.setNrConserve(3);
        zoo.conserveAnimal(pisica.getNume(), pisica.getNrConserve());
*/
        Animal pisica = new Animal("pisica", 3);
        zoo.conserveAnimal(pisica.getNume(),pisica.getNrConserve());

        Animal catel = new Animal("catel", 1);
        zoo.conserveAnimal(catel.getNume(),catel.getNrConserve());
     /*
        Animal catel = new Animal();
        catel.setNume("pisica");
        catel.setNrConserve(3);
        zoo.conserveAnimal(catel.getNume(), catel.getNrConserve());
*/

        // daca era cls public
      /*  Animal catel = new Animal();
        catel.nume ="catel";
        catel.nrConserve = 1;
        zoo.conserveAnimal(catel.nume, catel.nrConserve);
*/


    // String pisica = "pisica";
    // int nrConservePisica = 8;
      //  System.out.println(catel + " are " + " nrConservePisica " + " conserve ");
      //  zoo.conserveAnimal(pisica,nrConservePisica);


     //String catel = "catel";
    // int nrConserveCatel = 2;
   // zoo.conserveAnimal(catel, nrConserveCatel);
   // System.out.println(catel + " are " + " nrConserveCatel " + " conserve ");



    }

}
