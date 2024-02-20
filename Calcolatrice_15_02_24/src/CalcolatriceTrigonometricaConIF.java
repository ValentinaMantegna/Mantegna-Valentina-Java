import java.util.Scanner;

import java.util.Scanner;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class CalcolatriceTrigonometricaConIF {
    public CalcolatriceTrigonometricaConIF() {
    }

    public static void main(String[] args) {
        System.out.println("SCEGLI UNA TRA LE SEGUENTI OPERAZIONI:\n/t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVIZIONE\n\t 5) SENO");
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci l'operazione");
        int operatore = Integer.parseInt(tastiera.nextLine());
        if (operatore == 1) {
            System.out.println("Inserisci il primo addendo");
        }

        double primoAddendo = Double.parseDouble(tastiera.nextLine());
        System.out.println("Inserisci il secondo addendo");
        double secondoAddendo = Double.parseDouble(tastiera.nextLine());
        System.out.println("Il risultato della somma è: " + (primoAddendo + secondoAddendo));
        if (operatore == 2) {
            System.out.println("Sono una differenza");
        } else {
            System.out.println();
        }

    }
}
