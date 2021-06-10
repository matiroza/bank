package bank;

import java.util.List;

public class Konto extends Bank{
    private String nazwa;
    private double saldo;
    private String typKonta;
    private String numerKonta;



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

    Konto findKonto(String numerKonta, Bank bank){
        Konto konto = new Konto();
        for (int i = 0; i < bank.getKonta().size(); i++){
            if (bank.getKonta().get(i).getNumerKonta() == numerKonta){
                konto = bank.getKonta().get(i);
            }
        }
        return konto;
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
    void wykonajPrzelew(Klient klient){
        Przelew przelew = klient.zacznijPrzelew();

        String konto = przelew.getNumerKonta();
        System.out.println(konto);
        System.out.println(getKonta().size());

        for(int i = 0; i < getKonta().size(); i++){
            System.out.println(getKonta().get(i).getNumerKonta());
            if(getKonta().get(i).getNumerKonta().equals(konto)){
                getKonta().get(i).addSaldo(przelew.getKwota());
                System.out.println("Przelew wykonany pomyslnie");
            }
        }

    }
}
