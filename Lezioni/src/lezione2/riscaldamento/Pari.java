package lezione2.riscaldamento;

import java.util.Scanner;

// chiedere un numero,true se è pari

public class Pari {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numero: ");
        int numero = Integer.parseInt(tastiera.nextLine());
        boolean condizione = numero % 2 == 0;
        System.out.println(condizione);
    }
}
