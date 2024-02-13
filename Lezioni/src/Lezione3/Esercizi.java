package Lezione3;
/* Es1: (if-else-Scanner) Chiedere un numero e stampare "pari" o "dispari"
   Es2: (for) Chiedere quante temperature si vuole inserire,stampare il minimo,il massimo e la mesia (senza array).
   Es3: (for - ArrayList) salvare le temperature precedenti,stampare quelle maggiori di 10 gradi
   Es4: (while) chiedere all'utente dei numeri e sommarli finchè non scrive 0 ( terminare quando inserisce 0)
   Es5: (String, substring) stampare il proprio nome al contrario
 */

import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
        System.out.println("Inserisci numero: ");
        Scanner tastiera = new Scanner(System.in);
        int numero=Integer.parseInt(tastiera.nextLine());
        boolean condizione = (numero % 2 == 0

}
