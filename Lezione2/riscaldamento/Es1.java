package lezione2.riscaldamento;

import java.util.Scanner;

/* Scrivere un programma che chiede in input due numeri e stampa la somma */
/*main primo metodo che il programma chiama*/
public class Es1 {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // sout per avere Sysyem.out.println
        System.out.println("Inserisci numero: ");
        int n1 = Integer.parseInt(tastiera.nextLine());
        // CTRL + D per duplicare una riga
        System.out.println("Inserisci numero: ");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("La somma è " + (n1+n2));

    }
}
