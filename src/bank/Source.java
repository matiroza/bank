package bank;
import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Source {
    static void nowy_klient_menu(Bank bank){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imie i nazwisko");
        String imie = scan.nextLine();
        String nazwisko = scan.nextLine();
        System.out.println("Podaj adres zamieszkania");
        String adres = scan.nextLine();
        System.out.println("Podaj PESEL: ");
        String pesel = scan.nextLine();
        System.out.println("Podaj miesięczne zarobki: ");
        double pensja = scan.nextDouble();
        bank.addOsoba(new Klient(imie,nazwisko,adres,pesel,pensja));
        System.out.println("Gratulacje! Założyłeś nowe konto w banku " + bank.getName());
    }

    static  void stary_klient_menu(Bank bank){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko");
        String imie = scan.nextLine();
        String nazwisko = scan.nextLine();
        System.out.println("Wybierz konto: ");

        for(int i=0;i<bank.getKlienci().size();i++) {
            if(bank.getKlienci().get(i).getFirstName().equals(imie) && bank.getKlienci().get(i).getLastName().equals(nazwisko)){
                System.out.println("Witaj " + bank.getKlienci().get(i).getFirstName() + bank.getKlienci().get(i).getLastName());
                bank.getKlienci().get(i).wybierzKonto();
            }
            else{
                System.out.println("Niestety brak klienta w bazie");
            }
        }
    }

    static Bank wybierz_bank(List<Bank> banki){
        Bank wybrany_bank = null;
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<banki.size();i++){
            System.out.println(banki.get(i).getName());
        }

        System.out.println("Wybierz bank: ");
        String nazwa_banku = scanner.nextLine();

        for (Bank bank : banki) {
            if (nazwa_banku.equals(bank.getName())) {
                wybrany_bank = bank;
            }
        }
        return wybrany_bank;
    }
    public static void main(String[] args){
        List<Bank> banki = new ArrayList<>();
        banki.add(new Bank("ING", "Różana 5"));
        banki.add(new Bank("mBank", "Różasnkeigo 5"));

        Klient klient1 = new Klient(
                "Mateusz",
                "Różanowski",
                "ulica 1",
                "999888777666",
                1
                );
        Klient klient2 = new Klient(
                "Mati",
                "Róża",
                "ulica 2",
                "999888777666",
                2
                );
        Pracownik prac = new Pracownik(
                "Mathew",
                "Różalaski",
                "ulica 69",
                "666",
                23,
                1
                );
/*
        PKO.addOsoba(klient1);
        PKO.addOsoba(klient2);
        mBank.addOsoba(prac);
        //System.out.println(PKO);
        klient1.zalozKonto("konto 1", 100, "walutowe", "xys");
        klient1.zalozKonto("konto 2", 50000, "zwykle", "sfdsdaf");
        klient2.zalozKonto("konto 2", 50, "zwykle234543", "sfd342sda34f");
        //System.out.println(klient1.getKonta().get(0));
        //System.out.println(PKO.getOsoby().get(2).getClass().getSimpleName()); Pracownik
        //System.out.println(PKO.getOsoby().get(1));
        //klient1.getKonta().get(0).wykonajPrzelew();
        //System.out.println(klient1.getKonta().get(0).getSaldo());

        */

        //int choose = scanner.nextInt();


        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        do {

            Bank wybrany_bank = wybierz_bank(banki);

            System.out.println("1. Jestem nowym klientem");
            System.out.println("2. Jestem starym klientem");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    //System.out.println();
                    nowy_klient_menu(wybrany_bank);
                    break;
                case 2:
                    stary_klient_menu(wybrany_bank);
                    break;
                case 3:
                    loop = false;
                    break;
            }
            //wybrany_bank.printOsoby();

        }while(loop == true);





        


        /*

        System.out.println("1. Jestem nowym klientem");
        System.out.println("2. Jestem starym klientem");
        System.out.println("3. Wyjdź");



        switch(choose){
            case 1:
                System.out.println("Podaj imie i nazwisko");
                String imie = scanner.nextLine();
                String nazwisko = scanner.nextLine();
                System.out.println("Podaj adres zamieszkania");
                String adres = scanner.nextLine();
                System.out.println("Podaj PESEL: ");
                String pesel = scanner.nextLine();
                System.out.println("Podaj miesięczną pensje: ");
                double pensja = scanner.nextDouble();
                Klient klient = new Klient(imie,nazwisko,adres,pesel,pensja);
                System.out.println("Dostępne banki: ");
                for(int i=0;i<banki.size();i++){
                    System.out.println(i +". "+banki.get(i).getName());
                }

        }
*/

        }
    }
