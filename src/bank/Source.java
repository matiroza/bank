package bank;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Source {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        Bank PKO= new Bank("ING", "Różana 5");
/*        Klient klient1 = new Klient(
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

        Konto PKO1 = klient1.zalozKonto("PKO - Zwykle", 10000, "zwykle", "6546456949874");


        PKO.addKonto(PKO1);
        PKO.addKonto(PKO2);

        Raport raport = new Raport();


        PKO1.wykonajPrzelew(klient1, PKO);
        System.out.println(PKO2.getSaldo());
*/
        Klient klient = new Klient();
        Klient klient1 = new Klient();
        Konto PKO1 = new Konto("PKO - Zwykle", 10000, "zwykle", "654654564654");
        Konto PKO2 = new Konto("PKO - Zwykle", 10000, "zwykle", "0000");
        PKO.addKonto(PKO2);

        System.out.println("Witamy w naszym banku");
        System.out.println("Wybierz opcje: ");
        System.out.println("1. Zaloz konto");
        System.out.println("2. Wyplata pieniedzy");
        System.out.println("3. Wniosek o pozyczke");
        System.out.println("4. Wykonaj przelew");
        System.out.println("5. Sprawdz saldo");
        System.out.println("6. Pobierz raport");

        int opcja = Integer.valueOf(scan.nextLine());

        switch(opcja){
            case 1:
                System.out.println("Podaj imie i nazwisko");
                String imie = scan.nextLine();
                String nazwisko = scan.nextLine();
                System.out.println("Podaj adres zamieszkania");
                String adres = scan.nextLine();
                System.out.println("Podaj PESEL: ");
                String pesel = scan.nextLine();
                Klient klient2 = new Klient(imie, nazwisko, adres, pesel);

                PKO.addOsoba(klient);

                System.out.println("Konto zwykle, czy walutowe?");
                String wybor = scan.nextLine();

                Konto PKO3 = klient.zalozKonto("Konto PKO " + wybor, 0, wybor, String.valueOf(Math.floor(Math.random()*(999999999-11111111+1)+11111111)));
                PKO.addKonto(PKO3);

                PKO3.toString();
                break;
            case 2:
                System.out.println("Podaj kwote do wyplaty: ");
                double kwota = Double.valueOf(scan.nextLine());

                klient.wyplataPieniedzy(kwota, PKO1);
                break;
            case 3:
                System.out.println("Nie dostaniesz ani grosza");
                break;
            case 4:
                PKO1.wykonajPrzelew(klient, PKO);
                break;
            case 5:
                klient.sprawdzSaldo(PKO1);
                break;
        }

    }
}
