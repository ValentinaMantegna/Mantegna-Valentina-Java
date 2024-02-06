package lezione2.riscaldamento;

import java.util.Scanner;

public class EsercizioEquals {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("utente: ");
        String utente = tastiera.nextLine();
        System.out.println("password: ");
        String password = tastiera.nextLine();
        boolean condizione = utente.equals("Luana") && password.equals("Maria");
        System.out.println(condizione);
        System.out.println(condizione);
        if(condizione) {
            System.out.println("Messaggio segreto");
        } else {
            System.out.println("User e/o password errati");
        }
    }
}
