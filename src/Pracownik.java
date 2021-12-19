public class Pracownik implements PracownikI {
    private String imię;
    private int wzrost;
    private double waga;
    private double pensja;
    private String stanowisko;

    public Pracownik() {
    }

    public Pracownik(String imię, int wzrost, double waga, double pensja, String stanowisko) {
        this.imię = imię;
        this.wzrost = wzrost;
        this.waga = waga;
        this.pensja = pensja;
        this.stanowisko = stanowisko;
    }

    @Override
    public void przedstawSię() {
        System.out.println("Dzień dobry, mam na imię" + this.imię);
    }

    @Override
    public double obliczBMI() {
        return waga / (wzrost * wzrost);
    }

    @Override
    public void podwyższPensję(double podwyżka) {
        this.pensja += podwyżka;
    }

    @Override
    public void zmieńStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public void koniecPracy() {
        System.out.println("Do domu!");
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imię='" + imię + '\'' +
                ", wzrost=" + wzrost +
                ", waga=" + waga +
                ", pensja=" + pensja +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}
