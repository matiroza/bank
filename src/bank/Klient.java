package bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Klient extends Osoba {
    static private Integer Id = 0;
    private double zdolnoscKredytowa;
    private double pensja;
    private List<Konto> konta;
    public ArrayList<Przelew> przelewy = new ArrayList<>();

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


    ArrayList<Przelew> stworzRaport(java.time.LocalDate Od, java.time.LocalDate Do){
        ArrayList<Przelew> raport = new ArrayList<>();
        for (int i = 0; i < przelewy.size(); i++){
            if (przelewy.get(i).dataWykonania.isAfter(Od) && przelewy.get(i).dataWykonania.isBefore((Do))){
                raport.add(przelewy.get(i));
            }
        }

        return raport;
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

    static Pozyczka wniosekOpozyczke(double kwota){
        Date odd = new Date();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj na ile miesięcy chcesz wziąć pożyczke");
        int miesiecy = scan2.nextInt();
        if(kwota/(miesiecy*5000) < 10) {
            int rok = miesiecy / 12;
            int miesiac = miesiecy - rok * 12;
            Date doo = new Date(121 + rok, miesiac, 1);
            double rata = kwota/miesiecy;

            System.out.println("Właśnie wziąłęś pożyczke na " + kwota
                    + " z ratą " + Math.round(rata*100)/100 + " na " + rok + " rok i " + miesiac + " miesięcy" );
            return new Pozyczka(odd, doo, kwota, 5., rata);
        }else {
            System.out.println("Niestety nie masz takiej zdolnoscij kredytowej!");
            System.out.println("Weź niższą pożyczkę");
            return new Pozyczka(odd, odd, 0, 0, 0);
        }
    }

    void wybierzKonto(){
        System.out.println("Dostępne konta: ");
        for(int i=0;i<getKonta().size();i++){
            System.out.println(getKonta().get(i));
        }
    }
}


