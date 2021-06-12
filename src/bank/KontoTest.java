package bank;

import org.junit.jupiter.api.Test;
import bank.Konto;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    @Test
    public void przelewTest(){
        double kwota = 100;
        Konto konto = new Konto("Test", 100, "zwykle", "654654654");
        Konto konto1 = new Konto();
        konto.przewalutowanie(1000, "CHF", konto1);

        double actual = konto.getSaldo();

        assertEquals(kwota, actual);
    }
}