package Lezione4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Esercizio 1 (variabili, input e cast) : chiedere all'utente due numeri con la virgola e stampare la loro somma

Esercizio 2 (if-else): Chiedere all'utente un numero. Stampare il doppio se è pari, la metà se è dispari

Esercizio 3 (for-if): quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5?

Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una vocale.

Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione dispari.

Esercizio 6 (terminale - while): chiedere in loop all'utente un numero da 1 a 4. Far eseguire una delle seguenti azioni.

1 = inserimento numero lista
2 = rimozione numero lista
3 = stampa lista
4 = chiusura del programma.*/
/*public class  Esercizi4 {

  /*  public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero con la virgola: ");
        double numero = tastiera.nextDouble();
        System.out.print("Inserisci un numero con la virgola: ");
        double numero1 =tastiera.nextDouble();
        System.out.println("La somma è " + (numero+numero1));
    }
} */

  /*  public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numero: ");
        double n1 = tastiera.nextDouble();

        if (n1 % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + n1 * 2);
        } else {
            System.out.println("Il numero inserito è dispari: " + n1 / 2);
        }
    }

}*/

   /* public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int somma = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 || i % 5 == 0) {
                somma += i;
            }
        }
        System.out.println("La somma è: " + somma);
    }
} */

    // for each   (TIPO nome_variabile : nome_lista)

 /*   public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Alice");
        nomi.add("Roberto");
        nomi.add("Luna");
        nomi.add("Stella");
        nomi.add("Dante");
        nomi.add("Romeo");
        nomi.add("Maria");
        nomi.add("Giulio");
        nomi.add("Olga");
        nomi.add("Anna");

        ArrayList<String> nomiConsonante = new ArrayList<String>();

        for (String nome : nomi) {
            char primaLettera = Character.toUpperCase(nome.charAt(0));
            if(!( primaLettera === "A" || primaLettera === "E" || primaLettera === "I" || primaLettera === "O" || primaLettera === "U")) {

            }
        } */

     /*   System.out.println(nomi);



    }
} */