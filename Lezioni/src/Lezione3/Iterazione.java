package Lezione3;

public class Iterazione {
    public static void main(String[] args) {
        /*
        while(CONDIZIONE) {      //LA CONSIZIONE È UN BOOLEANO (VERO O FALSO)
         */
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        /* for (inizializzazione; condizione; aggiornamento)
         * istruzioni
         */
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        int [] a = new int[10] ; //new si utilizza quando creiamo qualcosa nell'int; crea array di 10 e mette il suo indirizzo dentro a

        a[0] = 1;
        System.out.println(a[0]);
        int [] b = {1,2,3,4,34,6,7,8,56};
        System.out.println(b);
    }
}
