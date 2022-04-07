import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ksiegowa extends Osoba {
    private boolean lubiWachac;
    private List<Ksiegowosc> prowadzoneKsiegowosci = new ArrayList<>();
    private static List<Ksiegowa> ksiegowe = new ArrayList<>();

    public Ksiegowa(String imie, String nazwisko, boolean lubiWachac) {
        super(imie, nazwisko);
        this.lubiWachac = lubiWachac;
        ksiegowe.add(this);
    }

    //-znajdz ksiegowa ktora ma najwiecej klientow
    public static Ksiegowa najwiecejKlientow(List<Ksiegowa> ksiegowe) {
        Ksiegowa najwiecej = ksiegowe.get(0);
        for (Ksiegowa k : ksiegowe) {
            if (k.prowadzoneKsiegowosci.size() > najwiecej.prowadzoneKsiegowosci.size()) {
                najwiecej = k;
            }
        }
        return najwiecej;
    }

    //-znajdz ksiegowa która zarobiła najwiecej
    public double sumaZarobkow() {
        double suma = 0;
        for (Ksiegowosc k : prowadzoneKsiegowosci) {
            suma += k.koszt();
        }
        return suma;
    }

    public static Ksiegowa zarobilaNajwiecej(List<Ksiegowa> ksiegowe) {
        Ksiegowa najwiecej = ksiegowe.get(0);
        for (Ksiegowa k : ksiegowe) {
            if (k.sumaZarobkow() > najwiecej.sumaZarobkow()) {
                najwiecej = k;
            }
        }
        return najwiecej;
    }

    //-znajdz ksiegowa która stracila najwiecej przez wąchanie siura
    // no dobra ale skoro wiemy ze bedziemy potrzebowac straty to nie lepiej wyliczac strate podczas prowadzenia ksiegowosci

//    public double sumaStrat() {
//        if (lubiWachac) {
//            double suma = 0;
//            for (Ksiegowosc k : prowadzoneKsiegowosci) {
//                if (k.getKlient().getObwod() == 15.5) {
//                    suma += k.koszt(); //dodajemy koszt jako strata == koszt
//                }
//            }
//            return suma;
//        }
//        return 0;
//    }
//

    public double sumaStrat() {
        double suma = 0;
        for (Ksiegowosc k : prowadzoneKsiegowosci) {
            suma += k.strata();
        }
        return suma;
    }

    public static Ksiegowa stracilaNaj(List<Ksiegowa> ksiegowe) {
        Ksiegowa najwiecej = ksiegowe.get(0);
        for (Ksiegowa k : ksiegowe) {
            if (k.sumaStrat() > najwiecej.sumaStrat()) {
                najwiecej = k;
            }
        }
        return najwiecej;
    }


    public boolean isLubiWachac() {
        return lubiWachac;
    }

    public void setLubiWachac(boolean lubiWachac) {
        this.lubiWachac = lubiWachac;
    }

    public static List<Ksiegowa> getKsiegowe() {
        return ksiegowe;
    }

    public List<Ksiegowosc> getProwadzoneKsiegowosci() {
        return prowadzoneKsiegowosci;
    }
}
