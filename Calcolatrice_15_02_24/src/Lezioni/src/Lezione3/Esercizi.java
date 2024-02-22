package Lezione3;

import java.util.ArrayList;
import java.util.Scanner;

//Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari

//Es2: (for) Chiedere quante temperature si vuole inserire stampare il minimo, massimo e la media (senza array).

//  Es3: (for - ArrayList) salvare le temperature precedenti
//    stampare quelle maggiori di 10 gradi

// Es4: (while) chiedere all'utente dei numeri e sommarli finché
//    non scrive 0 (terminare quando inserisce 0)

//   Es5: (String, substring) stampare il proprio nome al contrario
public class Esercizi {


 /* ES1  public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = Integer.parseInt(tastiera.nextLine());

        if (numero % 2 == 0) {
            System.out.println("Il numero inserito è pari.");
        } else {
            System.out.println("Il numero inserito è dispari.");
        }

    } */

 /*   public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Quante temperature vuoi inserire? ");
        int numeroTemperature = Integer.parseInt(tastiera.nextLine());

        int minimo = 0;
        int massimo = 0;
        int somma = 0;

        for (int i = 0; i < numeroTemperature; i++) {
            System.out.println("Inserisci la temperatura " + (i + 1) + ": ");
            int temperatura = Integer.parseInt(tastiera.nextLine());

             {
                if (temperatura < minimo) {
                    minimo = temperatura;
                }
                else if (temperatura > massimo) {
                    massimo = temperatura;
                }
            }

            somma += temperatura;
            System.out.println("Valore di i: " + i);
        }

        double media = (double) somma / numeroTemperature;

        System.out.println("Temperatura minima: " + minimo);
        System.out.println("Temperatura massima: " + massimo);
        System.out.println("Media delle temperature: " + media);

    }
}
*/

  /*  public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Integer> temperaturePrecedenti = new ArrayList<>();

        System.out.print("Quante temperature vuoi inserire? ");
        int numeroTemperature = Integer.parseInt(tastiera.nextLine());

        for (int i = 0; i < numeroTemperature; i++) {
            System.out.print("Inserisci la temperatura " + (i + 1) + ": ");
            int temperatura = Integer.parseInt(tastiera.nextLine());

            if (temperatura > 10) {
                System.out.println(temperatura);
            }

            temperaturePrecedenti.add(temperatura);
        }

        }

    } */


/*public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    int somma = 0;
    int numero;

    System.out.println("Inserisci dei numeri (inserisci 0 per terminare):");
    System.out.print("Inserisci un numero: ");
    numero = Integer.parseInt(tastiera.nextLine());

    while (numero != 0) {
        somma += numero;

        System.out.print("Inserire un numero: ");
        numero = Integer.parseInt(tastiera.nextLine());
    }

    System.out.println("La somma dei numeri inseriti è: " + somma);

}
} */

public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    System.out.print("Inserisci il tuo nome: ");
    String nome = tastiera.nextLine();

    System.out.println("Il tuo nome al contrario è:");
    for (int i = nome.length() - 1; i >= 0; i--) {
        System.out.print(nome.charAt(i));
    }

    tastiera.close();
}
}
