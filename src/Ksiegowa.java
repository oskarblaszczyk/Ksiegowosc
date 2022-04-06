import java.util.ArrayList;
import java.util.List;

public class Ksiegowa extends Osoba{
    private boolean lubiWachac;
    private static List<Ksiegowa> ksiegowe = new ArrayList<>();

    public Ksiegowa(String imie, String nazwisko, boolean lubiWachac) {
        super(imie, nazwisko);
        this.lubiWachac = lubiWachac;
        ksiegowe.add(this);
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

}
