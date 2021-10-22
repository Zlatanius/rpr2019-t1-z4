package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli = new ArrayList<Artikl>(0);

    public void dodajArtikl(Artikl a) {
        artikli.add(a);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl a : artikli) {
            if (a.getKod().equals(kod)) {
                return a;
            }
        }
        return null;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }


}
