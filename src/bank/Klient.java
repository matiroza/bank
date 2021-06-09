package bank;
import bank.Osoba;

import java.util.ArrayList;
import java.util.List;

//usunąc metode stworzKonto z diagramuKlas

public class Klient extends Osoba {
    private Integer Id;
    private double zdolnoscKredytowa;
    private double pensja;
    private List<Konto> konta;


    public Klient(String firstName, String lastName, String adress, String pesel, Integer id, double zdolnoscKredytowa, double pensja) {
        super(firstName, lastName, adress, pesel);
        Id = id;
        this.zdolnoscKredytowa = zdolnoscKredytowa;
        this.pensja = pensja;
        this.konta = new ArrayList<>();
    }
    public List<Konto> getKonta() {
        return konta;
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

    void zalozKonto(String nazwa, double saldo, String typKonta, String numerKonta){
        konta.add(new Konto(nazwa, saldo, typKonta, numerKonta));
    }

    //TODO
    void sprawdzSaldo(Konto konto){

    }

    //TODO
    void wyplataPieniedzy(double kwota){

    }

    //TODO
    void wniosekOpozyczke(double kwota){

    }

    //TODO
    void stworzRaport(java.util.Date Od,java.util.Date Do){

    }

    //TODO
    void zacznijPrzelw(){

    }

    //TODO
    void wybierzKonto(String nazwa){

    }


}
