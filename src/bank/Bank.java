package bank;
import bank.Osoba;

import java.util.*;

public class Bank {
    private String name;
    private String adress;
    private List<Klient> lista_klientow;

    public List<Osoba> getOsoby() {
        return osoby;
    }

    public void setOsoby(List<Osoba> osoby) {
        this.osoby = osoby;
    }

    private List<Osoba> osoby;

    Bank(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.osoby = new ArrayList<>();
    }

    Bank(){}

    public void addOsoba(Osoba osoba){
        osoby.add(osoba);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Klient> getKlienci() { return lista_klientow; }

    void printOsoby(){
        for(Osoba osoba : osoby) System.out.println(osoba.toString());
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
