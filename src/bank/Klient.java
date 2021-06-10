package bank;

import java.util.Scanner;

import java.util.List;

//usunąc metode stworzKonto z diagramuKlas

public class Klient extends Osoba {
    private Integer Id;
    private double pensja;


    public Klient(String firstName, String lastName, String adress, String pesel, Integer id, double pensja) {
        super(firstName, lastName, adress, pesel);
        Id = id;
        this.pensja = pensja;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
                ", pensja=" + pensja +
                '}'+ super.toString();
    }

    //TODO
    Konto zalozKonto(String nazwa, double saldo, String typKonta, String numerKonta){
        Konto konto = new Konto(nazwa, saldo, typKonta, numerKonta);

        return konto;
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
    Przelew zacznijPrzelew(){
        Scanner scan = new Scanner(System.in);

        Przelew przelew = new Przelew();

        System.out.println("Podaj kwotę: ");
        przelew.setKwota(Integer.valueOf(scan.nextLine()));
        System.out.println("Podaj numer konta: ");
        przelew.setNumerKonta(scan.nextLine());
        System.out.println("Tytul przelewu: ");
        przelew.setTytul(scan.nextLine());
        System.out.println("Nazwa odbiorcy: ");
        przelew.setImieInazwisko(scan.nextLine());
        System.out.println("Adres odbiorcy: ");
        przelew.setAdres(scan.nextLine());

        return przelew;
    }

    //TODO
    void wybierzKonto(String nazwa){

    }


}
