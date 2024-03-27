//Scrivere un metodo che restituisca true se un colore è contenuto nella lista, false altrimenti;
//il Main deve essere pulito

import java.util.ArrayList;
import java.util.List;

public class BooleanColori {

    public static void main(String[] args) {
        List<String> colori = new ArrayList<>(List.of("Rosso", "Arancione", "Giallo", "Verde"));

        // System.out.println("Il colore Giallo è contenuto nell'array colori? " + colori.contains("Giallo"));
        //System.out.println("Il colore Viola è contenuto nell'array colori ? " + colori.contains("Viola"));


        System.out.println(TrovaColore(colori, "blu"));
        System.out.println(TrovaColore(colori, "Giallo"));
        System.out.println(TrovaIndice(colori,"Verde"));
        System.out.println(TrovaIndice(colori,"Blu"));



    }

    public static boolean TrovaColore(List<String> colori, String color) {

        return colori.contains(color); // return colori.contains(color) ? true : false;

    }

    public static int TrovaIndice(List<String> colori, String color) {
        //return colori.indexOf(color);
        try {
            if (!colori.contains(color))
                throw new ColorNotFoundException(ColorNotFoundException.EXC_MESSAGE);
            return colori.indexOf(color);

        } catch (ColorNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }
}
