package bank;
public class Przelew {
    private double kwota;
    private String tytul;
    private String imieInazwisko;
    private String adres;
    private String numerKonta;
    java.time.LocalDate dataWykonania;


    public Przelew(double kwota, String numer,String tytul, String imieInazwisko, String adres, java.time.LocalDate dataWykonania) {
        this.kwota = kwota;
        this.numerKonta = numer;
        this.tytul = tytul;
        this.imieInazwisko = imieInazwisko;
        this.adres = adres;
        this.dataWykonania = dataWykonania;
    }

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
    public String getNumerKonta() { return numerKonta; }

    public void setNumerKonta(String numerKonta) { this.numerKonta = numerKonta; }
}
