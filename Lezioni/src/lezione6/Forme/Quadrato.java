package lezione6.Forme;

public class Quadrato extends Poligono {

    double lato;

    @Override
    public double area() {
        return lato * lato;
    }

    @Override
    public double perimetro() {
        return 4 * lato;
    }
}
