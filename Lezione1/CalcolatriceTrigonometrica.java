import java.util.Scanner;
// @author Valentina Mantegna
public class CalcolatriceTrigonometrica {

    public static void main(String[] args) {
        System.out.println("SCEGLI UNA TRA LE SEGUENTI OPERAZIONI:\n/t 1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVIZIONE\n\t 5) SENO\n \t 6) COSENO\n \t 7) TANGENTE");
        Scanner tastiera = new Scanner(System.in);


        do {
            System.out.println("Inserisci l'operazione");
            int operatore = Integer.parseInt(tastiera.nextLine());
            switch (operatore) {
                case 1:
                    System.out.println("Inserisci il primo addendo ");
                    double primoAddendo = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Inserisci il secondo addendo ");
                    double secondoAddendo = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Il risultato della somma è: " + (primoAddendo + secondoAddendo));
                    break;
                case 2:
                    System.out.println("Inserisci il minuendo");
                    double minuendo = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Inserisci il sottraendo");
                    double sottraendo = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Il risultato della differenza è: " + (minuendo - sottraendo));
                    break;
                case 3:
                    System.out.println("Inserisci il primo fattore");
                    double fattore1 = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Inserisci il secondo fattore");
                    double fattore2 = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Il risultato del prodotto è: " + fattore1 * fattore2);
                    break;
                case 4:
                    System.out.println("Inserisci il dividendo");
                    double dividendo = Double.parseDouble(tastiera.nextLine());
                    System.out.println("Inserisci il divisore");
                    double divisore = Double.parseDouble(tastiera.nextLine());
                    double var10000;
                    if (divisore == 0.0) {
                        var10000 = Double.POSITIVE_INFINITY;
                    } else {
                        var10000 = dividendo / divisore;
                    }

                    System.out.println("Il risultato  è: " + dividendo / divisore);
                    break;
                case 5:
                    System.out.println("Inserisci dato: ");
                    double dato = Double.parseDouble(tastiera.nextLine());
                    double rad = Math.toRadians(dato);
                    System.out.println(" Il seno è " + Math.sin(rad));
                    break;
                case 6:
                    System.out.println("Inserisci dato: ");
                    double dato1 = Double.parseDouble(tastiera.nextLine());
                    double rad1 = Math.toRadians(dato1);
                    System.out.println(" Il coseno è " + Math.cos(rad1));
                    break;
                case 7:
                    System.out.println("Inserisci dato: ");
                    double dato2 = Double.parseDouble(tastiera.nextLine());
                    double rad2 = Math.toRadians(dato2);
                    System.out.println(" Il coseno è " + Math.tan(rad2));
                    break;
                default:
                    System.out.println("DEVI SCEGLIERE GLI OPERATORI SCELTI!!!");
            }

            System.out.println("L'operatore scelto è " + operatore);

            // Chiedi all'utente se vuole rieseguire un calcolo
            System.out.println("Vuoi eseguire un'altra operazione? (y/n)");
        } while (tastiera.nextLine().equalsIgnoreCase("y"));

        System.out.println("Programma terminato");


        System.out.print("Inserisci un numero: ");
        int numero = Integer.parseInt(tastiera.nextLine());

        controllaDivisibilita(numero, 2);
        controllaDivisibilita(numero, 3);
        controllaDivisibilita(numero, 4);
        controllaDivisibilita(numero, 5);
    }

    public static void controllaDivisibilita(int x, int y) {
        if (x % y == 0) {
            System.out.println(x + " è divisibile per " + y + ".");
        } else {
            System.out.println(x + " non è divisibile per " + y + ".");
        }


        }

  }