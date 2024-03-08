package lezione6.Forme;

import java.util.ArrayList;
import java.util.List;

public class MainPoligono {
    public static void main(String[] args) { List<Poligono> forme = new ArrayList<>();
        Triangolo triangolo = new Triangolo();
        triangolo.lato1 = 10;
        triangolo.lato2 = 8;
        triangolo.lato3 = 6;

        Quadrato quadrato = new Quadrato();
        quadrato.lato = 8;

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.base = 20;
        rettangolo.altezza = 10;

        forme.add(triangolo);
        forme.add(quadrato);
        forme.add(rettangolo);

        double sommaAree = 0;

        //ogni elemento della lista forme verrà assegnato alla variabile forma
        // durante ogni iterazione del ciclo.
        //SommaAree += forma.area(); - All'interno del ciclo for, questo è il blocco di codice che verrà eseguito
        // ad ogni iterazione. Viene acceduto l'attributo area() di ogni poligono (forma) e il valore restituito
        // viene aggiunto alla variabile sommaAree. Quindi, alla fine del ciclo, sommaAree conterrà la somma delle
        // aree di tutti i poligoni presenti nella lista forme


        for (Poligono forma : forme) {

            sommaAree += forma.area();
        }

        System.out.println("La somma delle aree delle forme è: " + sommaAree);
    }
}
