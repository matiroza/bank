package bank;
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

    //TODO
    void przewalutowanie(double kwota, String waluta){

    }

    //TODO
    void wykonajPrzelew(Przelew przelew){

    }
}
