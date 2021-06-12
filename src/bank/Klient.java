package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//usunąc metode stworzKonto z diagramuKlas

public class Klient extends Osoba {
    static private Integer Id = 0;
    private double zdolnoscKredytowa;
    private double pensja;
    private List<Konto> konta;

    public Klient(String firstName, String lastName, String adress, String pesel, double pensja) {
        super(firstName, lastName, adress, pesel);
        this.pensja = pensja;
        this.konta = new ArrayList<>();
        Id += 1;
    }

    public List<Konto> getKonta() {
        return konta;
    }

    public Integer getId() {
        return Id;
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
                ", pensja=" + pensja +
                '}'+ super.toString();
    }

    void zalozKonto(double saldo, String typKonta, String numerKonta, String waluta){
        konta.add(new Konto(saldo, typKonta, numerKonta, waluta));
    }

    void sprawdzSaldo(Konto konto){
        System.out.println("Saldo " + "\"" + konto.getNazwa() + "\"" + ": " + konto.getSaldo() + " zł");
    }

    //TODO
    void wyplataPieniedzy(double kwota){

    }

    //TODO
    void wniosekOpozyczke(double kwota){

    }

    //TODO java.util.Date Od,java.util.Date Do
    void stworzRaport(){
        System.out.println("RAPORT");
        for(Konto konto: this.getKonta()) {
            System.out.println("Konto: " + konto.getNazwa());
        }
    }

    static Przelew zacznijPrzelew() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj kwotę: ");
        double kwota = scan.nextDouble();
        scan.nextLine();  //
        System.out.println("Podaj numer konta: ");
        String numer = scan.nextLine();
        System.out.println("Tytul przelewu: ");
        String tytul = scan.nextLine();
        System.out.println("Nazwa odbiorcy: ");
        String imie_i_nazwisko = scan.nextLine();
        System.out.println("Adres odbiorcy: ");
        String adres = scan.nextLine();

        return new Przelew(kwota, numer, tytul, imie_i_nazwisko, adres);
    }

    //TODO
    Konto wybierzKonto(){
        System.out.println("Dostępne konta: ");
        for(int i=0;i<getKonta().size();i++){
            System.out.println(getKonta().get(i));
        }
        return getKonta().get(0);
    }
}


