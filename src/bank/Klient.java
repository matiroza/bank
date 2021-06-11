package bank;

import java.util.ArrayList;
import java.util.Scanner;

//usunąc metode stworzKonto z diagramuKlas

public class Klient extends Osoba {
    private Integer Id;
    private double pensja;
    private ArrayList<Konto> lista_kont= new ArrayList<Konto>();

    public Klient(String firstName, String lastName, String adress, String pesel, Integer id, double pensja) {
        super(firstName, lastName, adress, pesel);
        Id = id;
        this.pensja = pensja;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public ArrayList<Konto> getListaKont() { return lista_kont; }

    @Override
    public String toString() {
        return "Klient{" +
                "Id=" + Id +
                ", pensja=" + pensja +
                '}'+ super.toString();
    }

    //TODO
    void zalozKonto(String nazwa, double saldo, String typKonta, String numerKonta){
        lista_kont.add(new Konto(nazwa, saldo, typKonta, numerKonta));
        System.out.println(lista_kont);
    }

    //TODO
    void sprawdzSaldo(Konto konto){

    }

    //TODO
    void wyplataPieniedzy(double kwota, Konto konto){

    }

    //TODO
    void stworzRaport(java.util.Date Od,java.util.Date Do){

    }

    //TODO
    Przelew zacznijPrzelew(){
        Scanner scan = new Scanner(System.in);

        Przelew przelew = new Przelew();

        System.out.println("Podaj kwotę: ");
        przelew.setKwota(Integer.valueOf(scan.nextLine()));
        System.out.println("Podaj numer konta: ");
        przelew.setNumerKonta(scan.nextLine());
        System.out.println("Tytul przelewu: ");
        przelew.setTytul(scan.nextLine());
        System.out.println("Nazwa odbiorcy: ");
        przelew.setImieInazwisko(scan.nextLine());
        System.out.println("Adres odbiorcy: ");
        przelew.setAdres(scan.nextLine());

        return przelew;
    }


    //wybierzKonto
    Konto znajdz_konto(String nazwa){
        Konto konto = null;
        for(int i=0; i<lista_kont.size(); i++){
            if(nazwa.equals(lista_kont.get(i).getNazwa())) {
                konto = lista_kont.get(i);
            }
        }
        return konto;
    }


}
