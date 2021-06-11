package bank;
public class Przelew extends Konto {
    private double kwota;
    private String tytul;
    private String imieInazwisko;
    private String adres;
    String numerKonta;
    java.time.LocalDate dataWykonania;

    public Przelew(double kwota, String tytul, String imieInazwisko, String adres, String numerKonta) {
        this.kwota = kwota;
        this.tytul = tytul;
        this.imieInazwisko = imieInazwisko;
        this.adres = adres;
        this.numerKonta = numerKonta;
    }

    public Przelew(){}

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getImieInazwisko() {
        return imieInazwisko;
    }

    public void setImieInazwisko(String imieInazwisko) {
        this.imieInazwisko = imieInazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public String getNumerKonta() {return numerKonta; }

    public void setDataWykonania(java.time.LocalDate dataWykonania) {this.dataWykonania = dataWykonania; }
}
