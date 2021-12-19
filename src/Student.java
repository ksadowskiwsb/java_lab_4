import java.util.ArrayList;
import java.util.List;

public class Student implements StudentI {
    private String imię;
    private int numerIndeksu;
    private int wzrost;
    private int waga;
    private List<Double> listaOcen;

    public Student() {
        this.listaOcen = new ArrayList<>();
    }

    public Student(String imię, int numerIndeksu, int wzrost, int waga) {
        this.imię = imię;
        this.numerIndeksu = numerIndeksu;
        this.wzrost = wzrost;
        this.waga = waga;
        this.listaOcen = new ArrayList<>();
    }

    @Override
    public void przedstawSię() {
        System.out.println("Nazywam się " + this.imię);
    }

    @Override
    public double obliczBMI() {
        return waga / (wzrost * wzrost);
    }

    @Override
    public double obliczSrednią() {
        int x = 0;

        for (double ocena : this.listaOcen) {
            x += ocena;
        }

        return x / listaOcen.toArray().length;
    }

    @Override
    public int podajNrIndeksu() {
        return this.numerIndeksu;
    }

    @Override
    public void koniecNauki() {
        System.out.println("Impreza!");
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public void dodajOcenę(double ocena) {
        this.listaOcen.add(ocena);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imię='" + imię + '\'' +
                ", numerIndeksu=" + numerIndeksu +
                ", wzrost=" + wzrost +
                ", waga=" + waga +
                ", listaOcen=" + listaOcen +
                '}';
    }
}
