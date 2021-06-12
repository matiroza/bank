package bank;

import java.util.List;

public class Konto {
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

    //TODO
    void przewalutowanie(double kwota, String waluta){

    }

    //TODO
    void wykonajPrzelew(){
        Przelew p = Klient.zacznijPrzelew();
        String numer = p.getNumerKonta();
        for(int i=0; i<Bank.getOsoby().size(); i++){
            if(Bank.getOsoby().get(i).getClass().getSimpleName().equals("Klient")){
                List<Konto> konta= ((Klient)Bank.getOsoby().get(i)).getKonta();
                int ile_kont = konta.size();
                for(int j=0;j<ile_kont;j++) {
                    if(konta.get(j).getNumerKonta().equals(numer)){
                        System.out.println("Numer sie zgadza, przelewamy");
                        konta.get(j).addSaldo(p.getKwota());
                    }
                }
            }

        }






    }
}
