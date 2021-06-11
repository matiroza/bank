package bank;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Pracownik extends Osoba{
    private int id;
    private double pensja;

    public Pracownik(String firstName, String lastName, String adress, String pesel, int id, double pensja) {
        super(firstName, lastName, adress, pesel);
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
    boolean zatwierdzPozyczke(){
        return true;
    };

}
