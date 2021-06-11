package bank;

import java.util.ArrayList;
import java.util.List;

public class Konto extends Bank{
    private String nazwa;
    private double saldo;
    private String typKonta;
    private String numerKonta;
    private ArrayList<Double> wnioskowane_kwoty = new ArrayList<>();


    public Konto(String nazwa, double saldo, String typKonta, String numerKonta) {
        this.nazwa = nazwa;
        this.saldo = saldo;
        this.typKonta = typKonta;
        this.numerKonta = numerKonta;
    }

    public Konto(){}

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTypKonta() {
        return typKonta;
    }

    public void setTypKonta(String typKonta) {
        this.typKonta = typKonta;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void addSaldo(double kwota){
        saldo += kwota;
    }


    void wniosekOpozyczke(double kwota){
        wnioskowane_kwoty.add(kwota);
        System.out.println("Wnioskowana kwota: " + kwota);
        System.out.println("Wniosek został przesłany!");
    }

    void przewalutowanie(double kwota, String waluta, Konto konto){

        double doWyplaty;

        if(kwota <= getSaldo()) {
            if (waluta == "EUR") {
                doWyplaty = kwota / 4.5;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta == "USD") {
                doWyplaty = kwota / 3.6;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta == "GBP") {
                doWyplaty = kwota / 5.2;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta == "CHF") {
                doWyplaty = kwota / 4.1;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else {
                System.out.println("Nie obsługiwana waluta");
            }
        } else {
            System.out.println("Nie wystarczająca ilośc środków");
        }
    }

    //TODO
    void wykonajPrzelew(Klient klient) {
        Przelew przelew = klient.zacznijPrzelew();

        String konto = przelew.getNumerKonta();
        System.out.println(konto);
    }

}
