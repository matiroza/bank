package bank;

import org.junit.jupiter.api.Test;
import bank.Konto;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    @Test
    public void walutaTest(){
        double kwota = 100;
        Konto konto = new Konto(100, "Test", "56464645", "PLN");
        Konto konto1 = new Konto();
        konto.przewalutowanie(1000, "CHF", konto1);

        double actual = konto.getSaldo();

        assertEquals(kwota, actual);
    }

    @Test
    public void przelewTest(){
        double kwota = 100;

        Konto konto = new Konto(100, "ror", "494654", "PLN");
        Konto konto2 = new Konto(0, "ror", "0000", "PLN");

    }
}