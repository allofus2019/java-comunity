package Zoo;

public class Animal {

    public Animal(String nume, int nrConserve){
        this.nume = nume;
        this.nrConserve = nrConserve;
    }

    private String nume;
    private int nrConserve;


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrConserve(int nrConserve) {
        this.nrConserve = nrConserve;
    }

    public String getNume() {
        return nume;
    }

    public int getNrConserve() {
        return nrConserve;
    }


}
