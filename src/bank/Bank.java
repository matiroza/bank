package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private String adress;
    static private List<Osoba> osoby;
    private List<Klient> klienci = new ArrayList<>();
    private List<Pracownik> pracownicy = new ArrayList<>();

    static public List<Osoba> getOsoby() {
        return osoby;
    }

    Bank(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.osoby = new ArrayList<>();
    }

    public void addOsoba(Osoba osoba){
        osoby.add(osoba);
        if(osoba.getClass().getSimpleName().equals("Klient")) klienci.add((Klient)osoba);
        else pracownicy.add((Pracownik)osoba);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    void printOsoby(){
        for(Osoba osoba : osoby) System.out.println(osoba.toString());
    }

    List<Klient> getKlienci(){ return klienci; }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    @Override
    public String toString() {
        printOsoby();
        return "Bank{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}' + super.toString();
    }
}
