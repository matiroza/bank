package bank;
import bank.Osoba;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

public class Klient extends Osoba {
    private Integer Id;
    private double zdolnoscKredytowa;
    private double pensja;

    public Klient(String firstName, String lastName, String adress, String pesel, Integer id, double zdolnoscKredytowa, double pensja) {
        super(firstName, lastName, adress, pesel);
        Id = id;
        this.zdolnoscKredytowa = zdolnoscKredytowa;
        this.pensja = pensja;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public double getZdolnoscKredytowa() {
        return zdolnoscKredytowa;
    }

    public void setZdolnoscKredytowa(double zdolnoscKredytowa) {
        this.zdolnoscKredytowa = zdolnoscKredytowa;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "Id=" + Id +
                ", zdolnoscKredytowa=" + zdolnoscKredytowa +
                ", pensja=" + pensja +
                '}'+ super.toString();
    }
}
