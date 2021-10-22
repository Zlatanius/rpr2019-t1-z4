package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Arrays;

public class Korpa {
    private ArrayList<Artikl> artikli = new ArrayList<Artikl>(0);

    public boolean dodajArtikl(Artikl noviArtikl) {
        if (artikli.size() < 50) {
            artikli.add(noviArtikl);
            return true;
        } else {
            return false;
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl a : artikli) {
            if (a.getKod().equals(kod)) {
                artikli.remove(a);
                return a;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (Artikl a : artikli) {
            ukupnaCijena += a.getCijena();
        }
        return  ukupnaCijena;
    }


}
