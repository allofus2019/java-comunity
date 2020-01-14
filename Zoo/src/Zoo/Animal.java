package Zoo;

public class Animal {

    private String nume;

    private int nrConserve;

    public Animal(String nume, int nrConserve) {
        this.nume = nume;
        this.nrConserve = nrConserve;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrConserve(int nrConserve) {
        this.nrConserve = nrConserve;
    }

    public int getNrConserve() {
        return nrConserve;
    }

    public String getNume() {
        return nume;
    }

}
