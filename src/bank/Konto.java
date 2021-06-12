package bank;

import java.util.List;
import java.util.Scanner;

public class Konto {
    private String nazwa;
    private double saldo;
    private String typKonta;
    private String numerKonta;
    private String waluta;

    public Konto(double saldo, String typKonta, String numerKonta,String waluta) {
        this.saldo = saldo;
        this.typKonta = typKonta;
        this.numerKonta = numerKonta;
        this.waluta = waluta;
    }

    public Konto() {}

    public String getWaluta(){
        return waluta;
    }
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

    public void addSaldo(double kwota) {
        saldo += kwota;
    }

    public void wyplac(double kwota) {
        if (kwota <= this.getSaldo())
            saldo -= kwota;
        else System.out.println("Brak wystarczajacch srodkow");
    }

    void przewalutowanie(double kwota, String waluta, Konto konto) {
        double doWyplaty;
        System.out.println(waluta);

        if(kwota <= getSaldo()) {
            if (waluta.equals("EUR")) {
                doWyplaty = kwota / 4.5;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta.equals("USD")) {
                doWyplaty = kwota / 3.6;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta.equals("GBP")) {
                doWyplaty = kwota / 5.2;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else if (waluta.equals("CHF")) {
                doWyplaty = kwota / 4.1;
                setSaldo(getSaldo() - kwota);
                konto.setSaldo(getSaldo() + doWyplaty);
            } else {
                System.out.println("Nie obsługiwana waluta");
            }
            this.waluta = waluta;
        } else {
            System.out.println("Nie wystarczająca ilośc środków");
        }
    }

    void wykonajPrzelew() {
        Przelew p = Klient.zacznijPrzelew();
        String numer = p.getNumerKonta();
        for (int i = 0; i < Bank.getOsoby().size(); i++) {
            if (Bank.getOsoby().get(i).getClass().getSimpleName().equals("Klient")) {
                List<Konto> konta = ((Klient) Bank.getOsoby().get(i)).getKonta();
                for (Konto konto : konta) {
                    if (konto.getNumerKonta().equals(numer)) {
                        if(getSaldo()>=p.getKwota()) {
                            System.out.println("Numer sie zgadza, przelewamy");
                            konto.addSaldo(p.getKwota());
                            addSaldo(-p.getKwota());
                        }else {
                            System.out.println("Brak środków na koncie");
                        }
                    }
                }
            }
        }
    }

    void wezPozyczke(){
        System.out.println("Podaj kwote pożyczki");
        Scanner scan = new Scanner(System.in);
        double kwota =  scan.nextDouble();
        Pozyczka p = Klient.wniosekOpozyczke(kwota);
        this.setSaldo(p.getKwota());
        p.pobierzRata(this);

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Konto{");
        sb.append(", saldo=").append(saldo);
        sb.append(", typKonta='").append(typKonta).append('\'');
        sb.append(", numerKonta='").append(numerKonta).append('\'');
        return sb.toString();
    }
}
