public enum RodzajKsiegowosci {
    KREATYWNA_KSIEGOWOSC(500),
    LICZENIE_PITOW(300),
    WYLUDZENIE_VATU(1500);

    private final int cena;

    RodzajKsiegowosci(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "RodzajKsiegowosci{" +
                "cena=" + cena +
                '}';
    }
}
