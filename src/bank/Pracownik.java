package bank;

import java.util.List;

public class Pracownik {
    private int id;
    private double pensja;

    public Pracownik(int id, double pensja) {
        this.id = id;
        this.pensja = pensja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    //TODO
    void tworzenieRaportow(List<Klient> klienci){

    }

    //TODO
    boolean zatwierdzPozyczke(){
        return true;
    };

}
