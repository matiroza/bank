package bank;

import java.util.Date;

public class Pozyczka {
    private Date Od;
    private Date Do;
    private double kwota;
    private double oprocentowanie;
    private double rata;

    public Pozyczka(Date od, Date aDo, double kwota, double oprocentowanie, double rata) {
        Od = od;
        Do = aDo;
        this.kwota = kwota;
        this.oprocentowanie = oprocentowanie;
        this.rata = rata;
    }


    public Date getOd() {
        return Od;
    }

    public void setOd(Date od) {
        Od = od;
    }

    public Date getDo() {
        return Do;
    }

    public void setDo(Date aDo) {
        Do = aDo;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }

    public void setOprocentowanie(double oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    public double getRata() {
        return rata;
    }

    public void setRata(double rata) {
        this.rata = rata;
    }

    void pobierzRata(Konto konto){
        if(konto.getSaldo()-getRata()>=0)
            konto.setSaldo(konto.getSaldo() - getRata());
    }
}
