// @author Valentina Mantegna

/*appunti:
-INTPUT => 2 array bidimensionali
- Controllare se vi sono 2 righe uguali confrontando i 2 array
-OUTPUT => Ci sono righe uguali/Non ci sono righe uguali
 */

import java.util.Arrays;

public class RigheUguali {

    public static void main(String[] args) {
        int[][] array1 = {
                {19, 25, 30},
                {45, 59, 66},
                {71, 83, 96}
        };

        int[][] array2 = {
                {45, 59, 66},
                {77, 82, 90},
                {10, 17, 2}
        };

        if (controllaRigheUguali(array1, array2)) {
            System.out.println("Esiste una riga uguale in array1 rispetto a una riga in array2.");
        } else {
            System.out.println("Non esiste una riga uguale in array1 rispetto a una riga in array2.");
        }
    }

    public static boolean controllaRigheUguali(int[][] array1, int[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (Arrays.equals(array1[i], array2[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
