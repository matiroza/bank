package bank;

import static org.junit.jupiter.api.Assertions.*;
import bank.Bank;
import org.junit.jupiter.api.Test;

class BankTest {
    @Test
    public void testKlienci(){
        Bank bank = new Bank("xyz", "xyz");
        Klient klient = new Klient("xyz", "xyz", "xyz", "46546654", 4500);
        Klient klient1 = new Klient("xydz", "xdyz", "xydz", "465246654", 5500);

        bank.addOsoba(klient);
        bank.addOsoba(klient1);

        assertNotNull(bank.getKlienci());
    }

    @Test
    public void testPracownicy(){
        Bank bank = new Bank("xyz", "xyz");
        Pracownik pracownik = new Pracownik("xyz", "xyz", "xyz", "65454", 545, 45454);
        Pracownik pracownik1 = new Pracownik("xydz", "xyd", "xydz", "6542354", 5245, 452454);

        bank.addOsoba(pracownik);
        bank.addOsoba(pracownik1);

        assertNotNull(bank.getPracownicy());
    }
}