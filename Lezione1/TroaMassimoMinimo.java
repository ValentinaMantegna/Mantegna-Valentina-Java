//Scrivere un programma che trovi il massimo ed il minimo di un elemento all’interno di un array.
public class TroaMassimoMinimo {
    public static void main(String[] args) {
        int[] numeri = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};

        int massimo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;


        for (int i = 0; i < numeri.length; i++) {
            int numero = numeri[i]; // Access element using index
            if (numero > massimo) {
                massimo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("Il massimo valore è: " + massimo);
        System.out.println("Il minimo valore è: " + minimo);
    }
}

