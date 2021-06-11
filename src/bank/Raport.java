package bank;

import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Raport extends Klient {
    private Date Od;
    private Date Do;
    private double sumaWydatkow;
    private double sumaPrzychodow;
    private double sumarycznyBilansKont;

    public Raport(Date od, Date aDo) {
        Od = od;
        Do = aDo;
    }

    public Raport(){}


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

    void newRaport(Klient klient, java.time.LocalDate Od, java.time.LocalDate Do){
        ArrayList<Przelew> raport = klient.stworzRaport(Od, Do);
        double suma = 0;

        for (int i = 0; i < raport.size(); i++){
            suma += raport.get(i).getKwota();
        }

        System.out.println("Suma wydatkow: " + suma);
    }
}
