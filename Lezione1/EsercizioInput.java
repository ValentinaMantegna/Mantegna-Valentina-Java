import java.util.Scanner;
public class  EsercizioInput {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in); // deve esserci sempre per il terminale
        System.out.print("Inserisci un nome: "); //togliere ln per non andare a capo;lbn significa nuova linea
        System.out.print("Inserisci un cognome: "); 
        System.out.print("Inserisci eta: ");
        System.out.print("Inserisci base: ");
        System.out.print("Inserisci altezza: ");
        String nome = tastiera.nextLine(); //variabile con il nome tastiera
        String cognome = tastiera.nextLine();
        String numero= "4";
        int eta= Integer.parseInt(tastiera.nextLine()); // coversione di un tipo di variabile
        int base= Integer.parseInt(tastiera.nextLine());
         int altezza= Integer.parseInt(tastiera.nextLine());
       // System.out.println("Ciao "+ nome);
        System.out.println("Ciao "+ nome +" "+ cognome +" e hai "+ eta*2+ " anni " + " Area: "+ base*altezza);
       
        int a = Integer.parseInt(numero);

       /*  int b =0;
        System.out.println(b); */
        //double n1 = (double)a;
        char c = 'a'; // singoli caratteri corrispondono a un numero (ASCII), fare con una virgolettaf
        int n2 = (int)c;
        System.out.println(n2);

        //a++ stampato 4 e incrementa e mette 5
        //++a incrementa e poi stampa 5
       


    }
}