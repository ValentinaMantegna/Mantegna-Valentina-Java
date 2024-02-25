import java.util.Scanner;
// @author Valentina Mantegna
// Input=> 3 numeri interi
//trovare il numero minimo
//output => numero minimo
public class NumeroMinimo {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int numero1 = Integer.parseInt(tastiera.nextLine());

        System.out.println("Inserisci il secondo numero: ");
        int numero2 = Integer.parseInt(tastiera.nextLine());

        System.out.println("Inserisci il terzo numero: ");
        int numero3 = Integer.parseInt(tastiera.nextLine());

        int minimo;

        if (numero1 <= numero2 && numero1 <= numero3) {
            minimo = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            minimo = numero2;
        } else {
            minimo = numero3;
        }

        System.out.println("Il numero più piccolo tra " + numero1 + ", " + numero2 + " e " + numero3 + " è: " + minimo);
    }
}