public class Prostokąt extends Figura{
    private double a;
    private double b;

    public Prostokąt() {
    }

    public Prostokąt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    double pole() {
        return this.a * this.b;
    }

    @Override
    double obwód() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public String toString() {
        return "Prostokąt{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

