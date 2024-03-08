package lezione6.Forme;

public class Triangolo extends Poligono {
    double lato1;
    double lato2;
    double lato3;

   // inizializzazione dei lati nel costruttore della classe Triangolo.
   // Assicurati di avere un costruttore che inizializzi correttamente i valori dei lati prima di chiamare
   // i metodi area() e perimetro()
    public Triangolo(double l1, double l2, double l3) {
        this.lato1 = l1;
        this.lato2 = l2;
        this.lato3 = l3;
    }

    public Triangolo() {

    }


    @Override
    public double area() {
        // Calcolo dell'area del triangolo usando la formula di Herone
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
        // Nota: questo calcolo non tiene conto dei casi in cui il triangolo potrebbe non essere valido
    }

    @Override
    public double perimetro() {
        return lato1 + lato2 + lato3;
    }
}