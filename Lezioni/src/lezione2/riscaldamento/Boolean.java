package lezione2.riscaldamento;

import java.util.Scanner;
//chiedere all'utente un numero
// stampare true se un voto insufficiente (cioè tra 0 e 5)
public class Boolean {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numero: ");
        int voto = Integer.parseInt(tastiera.nextLine());
        boolean condizione = (voto > 0) && (voto <= 5) ;
        System.out.println(condizione);
    }
}
