package lezione6.Forme;

public class Rettangolo extends Poligono {

    double base;
    double altezza;

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }
}
