package bank;
import java.util.Scanner;


public class Source {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bank PKO= new Bank("ING", "Różana 5");
        Klient klient1 = new Klient(
                "Mateusz",
                "Różanowski",
                "ulica 1",
                "999888777666",
                1,
                100000,
                5000);
        Klient klient2 = new Klient(
                "Mati",
                "Róża",
                "ulica 2",
                "999888777666",
                2,
                500000,
                1000);

        PKO.addOsoba(klient1);
        PKO.addOsoba(klient2);
        //System.out.println(PKO);
        klient1.zalozKonto("konto 1", 34234, "walutowe", "xys");
        System.out.println(klient1.getKonta().get(0).getNazwa());
        klient1.sprawdzSaldo(klient1.getKonta().get(0));
        klient1.stworzRaport();



        }




    }
