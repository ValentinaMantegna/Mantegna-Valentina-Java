/*- INPUT => Inserire due numeri per svolgere le operazioni richieste
        - Addizione
        - Sottrazione
        - Moltiplicazione
        - Divisione ( divisore deve essere diverso da 0; )
        - OUTPUT => Risultato delle operazioni

-   Ulteriore aggiunta: richiedo all'utente se vuole rieseguire un'altra operazione e
se il divisore è uguale a 0 richiedo un altro divisore
 */
//@ author Valentina Mantegna
import java.util.Scanner;

// Richiedo l'operazione
public class RichiestaOperazioni {

    public static void main(String[] args) {
        System.out.println("SCEGLI UNA TRA LE SEGUENTI OPERAZIONI:\n1) SOMMA\n \t 2) DIFFERENZA\n \t 3) PRODOTTO\n \t 4) DIVIZIONE");
        Scanner tastiera = new Scanner(System.in);

  //String = toRepeat
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
                    double risultato;
                    if (divisore != 0) {
                       risultato= dividendo/divisore;
                    } else
                        do {
                            System.out.println("Devi inserire un altro divisore");
                            divisore = Double.parseDouble(tastiera.nextLine());
                        } while (divisore == 0);  // end-do while


                    System.out.println("Il risultato  è: " + dividendo / divisore);
                    break;
                default:
                    System.out.println("DEVI SCEGLIERE GLI OPERATORI CORRETTI!!!");
            }
        //    System.out.println("L'operatore scelto è " + operatore);

            // Chiedi all'utente se vuole rieseguire un calcolo
            System.out.println("Vuoi eseguire un'altra operazione? (y/n)");
           // System.out.println("premi y per ripetere);
            //toRepeat = tastiera.nextLine())
        } while (tastiera.nextLine().equalsIgnoreCase("y")); // while (toRepeat.equals("y"))

        System.out.println("Programma terminato");
    }
    }