import java.util.ArrayList;
import java.util.List;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private static List<Osoba> ekstensja = new ArrayList<>();

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

        ekstensja.add(this);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public static List<Osoba> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
