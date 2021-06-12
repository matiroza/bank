package bank;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import java.util.List;

//usunąc metode stworzKonto z diagramuKlas

public class Klient extends Osoba {
    private Integer Id;
    private double pensja;
    private ArrayList<Przelew> przelewy = new ArrayList<>();
    private ArrayList<Konto> konta = new ArrayList<>();

    public Klient(String firstName, String lastName, String adress, String pesel) {
        super(firstName, lastName, adress, pesel);
    }

    public Klient(){}

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

    Konto zalozKonto(String nazwa, double saldo, String typKonta, String numerKonta){
        Konto konto = new Konto(nazwa, saldo, typKonta, numerKonta);
        konta.add(konto);

        return konto;
    }

    void sprawdzSaldo(Konto konto){
        System.out.println("Obecne saldo " + konto.getSaldo());
    }

    void wyplataPieniedzy(double kwota, Konto konto){
        double saldo = konto.getSaldo();
        if(kwota >= saldo){
            konto.addSaldo(-kwota);
        } else {
            System.out.println("Nie wystarczajaca ilosc srodkow");
        }
    }

    //TODO
    void wniosekOpozyczke(double kwota){

    }

    ArrayList<Przelew> stworzRaport(java.time.LocalDate Od, java.time.LocalDate Do){
        ArrayList<Przelew> raport = new ArrayList<>();
        for (int i = 0; i < przelewy.size(); i++){
            if (przelewy.get(i).dataWykonania.isAfter(Od) && przelewy.get(i).dataWykonania.isBefore((Do))){
                raport.add(przelewy.get(i));
            }
        }

        return raport;
    }

    Przelew zacznijPrzelew(){
        Scanner scan = new Scanner(System.in);

        Przelew przelew = new Przelew();

        System.out.println("Podaj kwotę: ");
        double kwota = Double.valueOf(scan.nextLine());
        if (kwota <= konta.get(0).getSaldo()){
            System.out.println("Brak wystarczajacych srodkow");
            return przelew;
        } else {
            konta.get(0).setSaldo(konta.get(0).getSaldo() - kwota);
            przelew.setKwota(Integer.valueOf(scan.nextLine()));
            System.out.println("Podaj numer konta: ");
            przelew.setNumerKonta(scan.nextLine());
            System.out.println("Tytul przelewu: ");
            przelew.setTytul(scan.nextLine());
            System.out.println("Nazwa odbiorcy: ");
            przelew.setImieInazwisko(scan.nextLine());
            System.out.println("Adres odbiorcy: ");
            przelew.setAdres(scan.nextLine());

            LocalDate now = LocalDate.now();
            przelew.setDataWykonania(now);

            przelewy.add(przelew);

            return przelew;
        }

    }

    //TODO
    void wybierzKonto(String nazwa){

    }


}
