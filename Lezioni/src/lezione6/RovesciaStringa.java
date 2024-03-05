package lezione6;

public class RovesciaStringa {



    public static String reverse(String x) {


        if (x.length() < 2)
            return x;
        else {
            String primaLettera = x.substring(0, 1);
           return reverse(x.substring(1)) + primaLettera;
        }

    }
    public static void main(String[] args) {
        String stringaInvertita = "Java";
        String risultato = reverse(stringaInvertita);
        System.out.println(" Se inverto la stringa ottengo "+ risultato);
    }



}
