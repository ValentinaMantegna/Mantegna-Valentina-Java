package Marji26Febbraio.accessModifier;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scuola sc = new Scuola("ENGIM ARTIGIANELLI", "C.so Palestro", "primo");
        System.out.println(sc);
        sc.setNomeScuola("ENGIM 123456");

     /**Scanner sc1 = new Scanner(System.in);
        Scuola primaria = new Scuola();
        System.out.println("Inserisci il nome della scuola:");
      //primaria.setNomeScuola(Scanner.nextLine());
**/
    }
}
