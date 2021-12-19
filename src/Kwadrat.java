public class Kwadrat extends Figura{
    private double a;

    public Kwadrat() {
    }

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    double pole() {
        return this.a * this.a;
    }

    @Override
    double obwód() {
        return 4 * this.a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "a=" + a +
                '}';
    }
}
