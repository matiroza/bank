package bank;

import java.util.Date;

public class Raport {
    private Date Od;
    private Date Do;
    private double sumaWydatkow;
    private double sumaPrzychodow;
    private double sumarycznyBilansKont;

    public Raport(Date od, Date aDo, double sumaWydatkow, double sumaPrzychodow, double sumarycznyBilansKont) {
        Od = od;
        Do = aDo;
        this.sumaWydatkow = sumaWydatkow;
        this.sumaPrzychodow = sumaPrzychodow;
        this.sumarycznyBilansKont = sumarycznyBilansKont;
    }


    public double getSumaWydatkow() {
        return sumaWydatkow;
    }

    public void setSumaWydatkow(double sumaWydatkow) {
        this.sumaWydatkow = sumaWydatkow;
    }

    public double getSumaPrzychodow() {
        return sumaPrzychodow;
    }

    public void setSumaPrzychodow(double sumaPrzychodow) {
        this.sumaPrzychodow = sumaPrzychodow;
    }

    public double getSumarycznyBilansKont() {
        return sumarycznyBilansKont;
    }

    public void setSumarycznyBilansKont(double sumarycznyBilansKont) {
        this.sumarycznyBilansKont = sumarycznyBilansKont;
    }

    Raport newRaport(){
        return new Raport(Od, Do, sumaWydatkow, sumaPrzychodow, sumarycznyBilansKont);
    }
}
