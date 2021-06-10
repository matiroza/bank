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

        PKO.addKonto(klient1.zalozKonto("PKO - Zwykle", 10000, "zwykle", "6546456949874"));
        PKO.addKonto(klient2.zalozKonto("PKO - Zwykle", 10000, "zwykle", "0000"));

        PKO.getKonta().get(0).wykonajPrzelew(klient1);

        System.out.println(PKO.getKonta().get(1).getSaldo());



    }
}
