package StruttureDatiEdEccezioni.src;

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

    public static class persona2 {



            private String nome;
            private String cognome;
            private String codiceFiscale;
            private String dataDiNascita;

            public void Persona2(String nome, String cognome, String codiceFiscale, String dataDiNascita) {
                this.nome = nome;
                this.cognome = cognome;
                this.codiceFiscale = codiceFiscale;
                this.dataDiNascita = dataDiNascita;
            }

            public String getCodiceFiscale() {
                return codiceFiscale;
            }

            public String toString() {
                return "Nome: " + nome + " Cognome: " + cognome + " Codice Fiscale: " + codiceFiscale + " Data di Nascita: " + dataDiNascita;
            }
        }
}
