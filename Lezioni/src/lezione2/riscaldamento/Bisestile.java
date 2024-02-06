package lezione2.riscaldamento;

import java.util.Scanner;

// dato un anno,stampare true se è bisestile
//un anno è bisestile se
// - è divivsibile per 4 ma non per 100
// oppurew è divisibile per 400
// 2024:SI
//1900: NO
//2023: NO
//2000: SI
public class Bisestile {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci numero: ");
        int anno = Integer.parseInt(tastiera.nextLine());
        boolean condizione =  (anno % 4 == 0) && (anno % 100 !=0) || (anno % 400== 0); // !(anno % 100 == 0)20
        System.out.println(condizione);
    }
}
