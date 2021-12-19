public class Dom implements Budynek {
    private double powierzchnia;
    private String adres;
    private int liczbaOkien;
    private int liczbaMieszkańców;
    private KolorEnum kolorBudynku;
    private boolean zamknięty = true;

    public Dom() {
    }

    public Dom(double powierzchnia, String adres, int liczbaOkien, int liczbaMieszkańców, KolorEnum kolorBudynku) {
        this.powierzchnia = powierzchnia;
        this.adres = adres;
        this.liczbaOkien = liczbaOkien;
        this.liczbaMieszkańców = liczbaMieszkańców;
        this.kolorBudynku = kolorBudynku;
    }


    @Override
    public double setAndGetPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;

        return this.powierzchnia;
    }

    @Override
    public String setAndGetAdres(String adres) {
        this.adres = adres;

        return this.adres;
    }

    @Override
    public int setAndGetLiczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;

        return this.liczbaOkien;
    }

    @Override
    public void setliczbaMieszkańców(int liczbaMieszkańców) {
        this.liczbaMieszkańców = liczbaMieszkańców;
    }

    @Override
    public void setkolorDomu(KolorEnum kolor) {
        this.kolorBudynku = kolor;
    }

    @Override
    public double ilośćPowierzchniNaMieszkańca(double powierzchnia, int liczbaMieszkańców) {
        return this.powierzchnia / this.liczbaMieszkańców;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getLiczbaOkien() {
        return liczbaOkien;
    }

    public void setLiczbaOkien(int liczbaOkien) {
        this.liczbaOkien = liczbaOkien;
    }

    public int getLiczbaMieszkańców() {
        return liczbaMieszkańców;
    }

    public KolorEnum getKolorBudynku() {
        return kolorBudynku;
    }

    public void zamknijDom() {
        this.zamknięty = true;
    }

    public void otwórzDom() {
        this.zamknięty = false;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + powierzchnia +
                ", adres='" + adres + '\'' +
                ", liczbaOkien=" + liczbaOkien +
                ", liczbaMieszkańców=" + liczbaMieszkańców +
                ", kolorBudynku=" + kolorBudynku +
                ", zamknięty=" + zamknięty +
                '}';
    }
}
