//Scrivere una funzione che dati N numeri, dica se tutti questi N numeri sono pari
public class NumeriPari {

    public static void main(String[] args) {
        int[] array = {22, 54, 67, 98, 310};

        boolean sonoPari = true;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number % 2 != 0) {
                sonoPari = false;
            }
        }

        if (sonoPari) {
            System.out.println("Tutti i numeri sono pari!");
        } else {
            System.out.println("Almeno un numero non è pari.");
        }
    }
}
