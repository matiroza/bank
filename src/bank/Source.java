package bank;

import java.util.Scanner;

public class Source {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Bank PKO= new Bank("ING", "Różana 5");
        Klient klient1 = new Klient(
                "Mateusz",
                "Różanowski",
                "ulica 1",
                "999888777666",
                1,
                5000);
        Klient klient2 = new Klient(
                "Mati",
                "Róża",
                "ulica 2",
                "999888777666",
                2,
                1000);

        PKO.addOsoba(klient1);
        PKO.addOsoba(klient2);

        klient1.zalozKonto("konto1", 3000,"walutowe","3242352345345");
        //System.out.println(klient1.getListaKont());

        //PKO.addKonto(klient2.zalozKonto("PKO - Zwykle", 10000, "zwykle", "0000"));

        //PKO.getKonta().get(0).wykonajPrzelew(klient1);

        //System.out.println(PKO.getKonta().get(1).getSaldo());





    }
}
