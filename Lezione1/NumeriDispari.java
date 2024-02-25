public class NumeriDispari {
    public static void main(String[] args) {
        int[] array = {23, 57, 67, 99, 311};

        boolean sonoDispari = true;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if ( number % 2 == 0) {
                sonoDispari = false;
            }
        }

        if (sonoDispari) {
            System.out.println("Tutti i numeri sono dispari!");
        } else {
            System.out.println("Almeno un numero non è dispari.");
        }
    }
}

