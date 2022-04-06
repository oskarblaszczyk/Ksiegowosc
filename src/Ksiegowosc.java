import java.util.ArrayList;
import java.util.List;

public class Ksiegowosc {
    private final String nazwa;
    private final RodzajKsiegowosci rodzajKsiegowosci;
    private final Klient klient;
    private final Ksiegowa ksiegowa;
    private static List<Ksiegowosc> ekstensja = new ArrayList<>();

    public Ksiegowosc(String nazwa, RodzajKsiegowosci rodzajKsiegowosci, Klient klient, Ksiegowa ksiegowa) {
        this.nazwa = nazwa;
        this.rodzajKsiegowosci = rodzajKsiegowosci;
        this.klient = klient;
        this.ksiegowa = ksiegowa;
        ekstensja.add(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public RodzajKsiegowosci getRodzajKsiegowosci() {
        return rodzajKsiegowosci;
    }

    public Klient getKlient() {
        return klient;
    }

    public Ksiegowa getKsiegowa() {
        return ksiegowa;
    }

    public static List<Ksiegowosc> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Ksiegowosc{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
