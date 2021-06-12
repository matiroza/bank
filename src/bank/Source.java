package bank;

import java.util.*;


public class Source {
    public static Scanner scanner = new Scanner(System.in);

    public static void obslugaKonta(Konto konto) {
        boolean loop = true;

        while (loop) {
            System.out.println("1. sprawdz saldo");
            System.out.println("2. przewalutowanie");
            System.out.println("3. wykonaj przelew ");
            System.out.println("4. wpłac środki");
            System.out.println("5. wypłata pieniędzy");
            System.out.println("6. Weź pożyczke");
            System.out.println("7. wyjdz");

            int choose = scanner.nextInt();

            switch (choose) {
                case 7:
                    loop = false;
                    break;
                case 1:
                    System.out.println(konto.getSaldo() + " " + konto.getWaluta());
                    break;
                case 2:
                    System.out.println("Dostępne waluty: ");
                    System.out.print("EUR, ");
                    System.out.print("USD, ");
                    System.out.print("GBP, ");
                    System.out.println("CHF");
                    System.out.println("Podaj walute");
                    String walutaa = scanner.next();
                    scanner.nextLine();
                    System.out.println("Podaj kwote");
                    double kwota = Double.parseDouble(scanner.nextLine());
                    konto.przewalutowanie(kwota, walutaa, konto);
                    break;
                case 3:
                    konto.wykonajPrzelew();

                    break;
                case 4:
                    System.out.println("Podaj kwote do wpłaty");
                    double kwota2 = scanner.nextDouble();
                    konto.addSaldo(kwota2);
                    break;
                case 5:
                    System.out.println("Podaj kwote do wypłaty");
                    double kwota3 = scanner.nextDouble();
                    konto.wyplac(kwota3);
                    break;
                case 6:
                    konto.wezPozyczke();

            }
        }
    }

    public static void wyswieltKonta(Klient klient, int i) {

        boolean loop = true;

        while (loop) {
            System.out.println("1. ror");
            System.out.println("2. walutowe");
            System.out.println("3. oszczednosciowe");
            System.out.println("4. wyjdz");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    obslugaKonta(klient.getKonta().get(0));
                    break;
                case 2:
                    obslugaKonta(klient.getKonta().get(1));
                    break;
                case 3:
                    obslugaKonta(klient.getKonta().get(2));
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }
    }

    static void nowy_klient_menu(Bank bank) {
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
        bank.addOsoba(new Klient(imie, nazwisko, adres, pesel, pensja));
        System.out.println("Gratulacje! Założyłeś nowe konto w banku " + bank.getName());
    }

    static void stary_klient_menu(Bank bank) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie i nazwisko");
        String imie = scan.nextLine();
        String nazwisko = scan.nextLine();

        for (int i = 0; i < bank.getKlienci().size(); i++) {
            if (bank.getKlienci().get(i).getFirstName().equals(imie) && bank.getKlienci().get(i).getLastName().equals(nazwisko)) {
                System.out.println("Witaj " + bank.getKlienci().get(i).getFirstName() + " " +bank.getKlienci().get(i).getLastName() + "!");
                Klient klient = bank.getKlienci().get(i);
                System.out.println(klient);
                System.out.println("Liczba kont: " +klient.getKonta().size());
                boolean loop = true;
                while (loop) {
                    System.out.println("1. Załóż nowe konto");
                    System.out.println("2. Wybierz konto");
                    System.out.println("3. Wyloguj");

                    int choose = scanner.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.println("Podaj typ konta");
                            String typKonta = scan.nextLine();
                            System.out.println("Podaj kwote początkową");
                            double kwota = scan.nextDouble();
                            String typ = scan.nextLine();
                            System.out.println("Podaj numer konto");
                            String numer = scan.nextLine();
                            System.out.println("Podaj walute");
                            String waluta = scan.nextLine();
                            klient.zalozKonto(kwota,typKonta, numer,waluta);
                            break;
                        case 2:
                            System.out.println("Posiadasz " + klient.getKonta().size() + " konta");
                            for (int j = 0; j < klient.getKonta().size(); j++) {
                                System.out.println(klient.getKonta().get(j).toString());
                            }
                            wyswieltKonta(klient, i);
                            break;
                        case 3:
                            loop = false;
                            break;
                    }
                }
            } else {
                System.out.println("Niestety brak klienta w bazie");
            }
        }
    }


    static Bank wybierz_bank(List<Bank> banki) {
        Bank wybrany_bank = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("Wybierz bank: ");
        for (int i = 0; i < banki.size(); i++) {
            System.out.println(banki.get(i).getName());
        }
        String nazwa_banku = scanner.nextLine();

        for (Bank bank : banki) {
            if (nazwa_banku.equals(bank.getName())) {
                wybrany_bank = bank;
            }
        }
        return wybrany_bank;
    }

    public static void main(String[] args) {
        List<Bank> banki = new ArrayList<>();
        banki.add(new Bank("ING", "Różana 5"));
        banki.add(new Bank("mBank", "Różasnkeigo 5"));

        Klient klient1 = new Klient(
                "mati",
                "roza",
                "ulica 1",
                "999888777666",
                10000
        );
        Klient klient2 = new Klient(
                "Mati",
                "Róża",
                "ulica 2",
                "999888777666",
                5000
        );
        Pracownik prac = new Pracownik(
                "Mathew",
                "Różalaski",
                "ulica 69",
                "666",
                23,
                4000
        );

        banki.get(0).addOsoba(klient1);
        banki.get(1).addOsoba(klient2);

        //System.out.println(PKO);
        klient1.zalozKonto( 100, "walutowe", "xys", "PLN");
        klient1.zalozKonto( 50000, "zwykle", "sfdsdaf", "EUR");
        klient2.zalozKonto( 50, "zwykle234543", "999","PLN");
        //System.out.println(klient1.getKonta().get(0));
        //System.out.println(PKO.getOsoby().get(2).getClass().getSimpleName()); Pracownik
        //System.out.println(PKO.getOsoby().get(1));
        //klient1.getKonta().get(0).wykonajPrzelew();
        //System.out.println(klient1.getKonta().get(0).getSaldo());



        //int choose = scanner.nextInt();*/


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

        } while (loop);


    }
}
