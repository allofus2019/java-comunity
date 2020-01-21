package Zoo;
//o clasa abstracta inseamna ca nu se va mai putea instantia clasa respectiva, poate doar fi extinsa
//abstract public class Animal {
public class Animal {
    private String nume;
    private   int nrConserve;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrConserve() {
        return nrConserve;
    }

    public void setNrConserve(int nrConserve) {
        this.nrConserve = nrConserve;
    }

    public Animal(String nume, int nrConserve){
        this.nume=nume;
        this.nrConserve=nrConserve;
    }
/*
    public void setNume(String nume){
        this.nume= nume;
    }

    public void  setNrConserve(int nrConserve){
        this.nrConserve= nrConserve;
    }

    public int getNrConserve(){
        return nrConserve;
    }

    public String getNume(){
        return nume;
    }*/
/* mostenirea e un concept care ii permite unei clase sa mosteneasca din alte clase*/

    public void action(){
        System.out.println("Animalul zboara");
    }

   // abstract public void nrPicioatre(int nr);
}
