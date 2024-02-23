package lezione6;

public class StringaInvertita3 {
    public static String rovesciaStringa(String str) {
        // Caso base: se la stringa è vuota o ha lunghezza 1, restituiamo la stringa stessa
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Caso ricorsivo: concateniamo l'ultimo carattere con la stringa invertita del resto della stringa
        return str.charAt(str.length() - 1) + rovesciaStringa(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "Final Fantasy";
        String risultato = rovesciaStringa(input);
        System.out.println("La stringa invertita di " + input + " è: " + risultato);
    }
}
