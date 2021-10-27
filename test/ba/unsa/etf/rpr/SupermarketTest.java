package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Zvake", 1, "1");
        s.dodajArtikl(a);
        assertEquals(a, s.getArtikli()[0]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Zvake", 1, "1");
        s.dodajArtikl(a);
        assertEquals(a, s.izbaciArtiklSaKodom("1"));
    }

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Zvake", 1, "1");
        s.dodajArtikl(a);
        assertEquals(a, s.getArtikli()[0]);
    }
}