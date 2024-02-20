//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class CalcolatriceClassica {
    public CalcolatriceClassica() {
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci primo numero: ");
        int num1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci  secondo numero: ");
        int num2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("La somma è " + (num1 + num2));
        System.out.println("La differenza è " + (num1 - num2));
        System.out.println("Il prodotto è " + num1 * num2);
        System.out.println("Inserisci primo numero: ");
        double num3 = tastiera.nextDouble();
        System.out.println("Inserisci  secondo numero: ");
        double num4 = tastiera.nextDouble();
        if (num4 == 0.0) {
            System.out.println("NOOOOOOO");
        } else {
            System.out.println("Il risultato è " + num3 / num4);
        }

        System.out.println("Inserisci primo numero: ");
        double angolo = 90.0;
        double rad = Math.toRadians(angolo);
        double cos = Math.cos(rad);
        System.out.println("cos(" + angolo + ") = " + cos);
    }
}
