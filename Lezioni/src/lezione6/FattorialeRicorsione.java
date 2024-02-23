package lezione6;
/*Fattoriale: Scrivi un metodo statico ricorsivo che calcola il fattoriale di un numero intero dato. Il fattoriale di un
        numero n (indicato con n!) è il prodotto di tutti i numeri interi positivi da 1 a n. Assicurati che
        il tuo metodo gestisca correttamente il caso base (il fattoriale di 0 è 1).*/
import java.util.Scanner;

public class FattorialeRicorsione {

    public static int calcolaFattoriale(int n) {

        if (n == 0) {
            return 1;
        }
      else {
            return n * calcolaFattoriale(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());


        int fattoriale = calcolaFattoriale(n1);
        System.out.println("Il fattoriale di " + n1 + " è: " + fattoriale);
    }
}
