//Controllare che all’interno di un array sia presente un determinato elemento e stamparne l’indice;
public class TrovaElementoArray {
    public static void main(String[] args) {
        int[] numeri = {10, 29, 33, 64, 95};
        int elementoDaTrovare = 33;

        int indiceTrovato = -1; //-1 indica che l'elemento non è stato trovato nell'array
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] == elementoDaTrovare) {
                indiceTrovato = i;
            }
        }

        if (indiceTrovato != -1) {
            System.out.println("L'elemento è presente all'indice " + indiceTrovato);
        } else {
            System.out.println("L'elemento non è presente nell'array.");
        }
    }
}
