import java.util.ArrayList;
import java.util.List;

public class Klient extends Osoba {
    private double obwod;
    private Ksiegowosc ksiegowosc;
    private static List<Klient> klienci = new ArrayList<>();

    public Klient(String imie, String nazwisko, double obwod) {
        super(imie, nazwisko);
        this.obwod = obwod;
        klienci.add(this);
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public static List<Klient> getKlienci() {
        return klienci;
    }

    public Ksiegowosc getKsiegowosc() {
        return ksiegowosc;
    }

    public void setKsiegowosc(Ksiegowosc ksiegowosc) {
        this.ksiegowosc = ksiegowosc;
    }
}
