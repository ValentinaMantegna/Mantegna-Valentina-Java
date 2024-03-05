package lezione6.Fattoriale;

import java.util.Scanner;

//Fattoriale: Scrivi un metodo statico ricorsivo che calcola il fattoriale di un numero intero dato.
// Il fattoriale di un numero n (indicato con n!) è il prodotto di tutti i numeri interi positivi da 1 a n.
// Assicurati che il tuo metodo gestisca correttamente il caso base (il fattoriale di 0 è 1).
public class Fattoriale {

    public static int fattoriale(int x) {
        if (x == 0) {
          return 1;

        } else
            return x * fattoriale(x- 1);
    }

    public static void main(String[] args) {


        int fattoriale = fattoriale(4);
        System.out.println("Il fattoriale  è: " + fattoriale);



    }
}