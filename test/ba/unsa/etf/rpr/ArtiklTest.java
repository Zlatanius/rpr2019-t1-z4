package ba.unsa.etf.rpr;

import jdk.nashorn.internal.AssertsEnabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Zvake", 1, "1");
        assertEquals("Zvake", a.getNaziv());
    }

    @org.junit.jupiter.api.Test
    void getCijena() {
        Artikl a = new Artikl("Zvake", 1, "1");
        assertEquals(1, a.getCijena());
    }

    @org.junit.jupiter.api.Test
    void getKod() {
        Artikl a = new Artikl("Zvake", 1, "1");
        assertEquals("1", a.getKod());
    }
}