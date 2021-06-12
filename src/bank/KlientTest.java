package bank;

import static org.junit.jupiter.api.Assertions.*;
import bank.Klient;
import org.junit.jupiter.api.Test;

class KlientTest {
    @Test
    public void testKonta(){
        Klient klient = new Klient("xyz", "xyz", "xyz", "46546654", 4500);
        Bank bank = new Bank("xyz", "xyz");

        klient.zalozKonto(1000, "xyz", "xyz", "xyz");

        assertNotNull(klient.getKonta());
    }
}