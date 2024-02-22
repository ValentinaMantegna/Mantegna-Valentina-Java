import java.util.Arrays;
// @author Valentina Mantegna
public class Matrice {

        public static void main(String[] args) {
            int[][] array = {
                    {10, 22, 63},
                    {49, 55, 76},
                    {10, 22, 63},
                    {79, 88, 19}
            };

            // Scorrere tutte le coppie di righe nell'array
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    // Controllare se le righe sono uguali
                    if (sonoRigheUguali(array[i], array[j])) {
                        System.out.println("Sono presenti due righe uguali nell'array.");
                        return; // Esci dal programma se trovi righe uguali
                    }
                }
            }

            // Se non sono state trovate righe uguali
            System.out.println("Non sono presenti due righe uguali nell'array.");
        }

        // Funzione per controllare se due righe sono uguali
        public static boolean sonoRigheUguali(int[] riga1, int[] riga2) {
            // Controlla se le due righe sono uguali
            return java.util.Arrays.equals(riga1, riga2);
        }
    }
