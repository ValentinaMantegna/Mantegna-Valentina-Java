package lezione6.Forme;

public class Rettangolo extends Poligono {

    double base; //private double base
    double altezza; //private double altezza

    //public Rettangolo(double base, double altezza){
    //this.base= base;
    //this.altezza= altezza;
//}

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altezza);
    }
}
