package lezione6;

public class ricorsivo4 {
    public static int calcolaSomma(int[] array, int lunghezza) {
        // Caso base: se la lunghezza è 0, la somma è 0
        if (lunghezza == 0) {
            return 0;
        }

        // Caso ricorsivo: somma l'elemento corrente e la somma dei restanti elementi
        return array[lunghezza-1] + calcolaSomma(array, lunghezza - 1);
    }

    public static void main(String[] args) {
        int[] array = {100, 87, 30, 39, 59};
        int lunghezza = array.length;

        int somma = calcolaSomma(array, lunghezza);
        System.out.println("La somma degli elementi dell'array è: " + somma);
    }

}
