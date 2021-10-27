package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Zvake:", 1, "1");
        k.dodajArtikl(a);
        assertEquals(a, k.getArtikli()[0]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Zvake:", 1, "1");
        k.dodajArtikl(a);
        assertEquals(a, k.izbaciArtiklSaKodom("1"));
    }

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Zvake:", 1, "1");
        k.dodajArtikl(a);
        assertEquals(a, k.getArtikli()[0]);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Zvake:", 1, "1");
        k.dodajArtikl(a);
        assertEquals(1, k.dajUkupnuCijenuArtikala());
    }
}