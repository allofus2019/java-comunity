package Zoo;

public class Animal {
    private String nume;
    private int nrConserve;

    public Animal(final String nume, final int nrConserve) {
        this.nume = nume;
        this.nrConserve = nrConserve;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(final String nume) {
        this.nume = nume;
    }

    public int getNrConserve() {
        return nrConserve;
    }

    public void setNrConserve(final int nrConserve) {
        this.nrConserve = nrConserve;
    }

}
