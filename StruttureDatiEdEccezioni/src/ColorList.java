import java.util.ArrayList;
import java.util.List;

//Scrivere un programma che inserisca dei colori all’interno di un arraylist e stamparlo.
public class ColorList {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>(List.of("Rosso","Arancione","Giallo","Verde"));

      /*  colorList.add("Rosso");
        colorList.add("Arancione");
        colorList.add("Giallo");
        colorList.add("Verde"); */

        for (String color : colorList) {
            System.out.println("COLORE: "+ color );
        }

    }

}
