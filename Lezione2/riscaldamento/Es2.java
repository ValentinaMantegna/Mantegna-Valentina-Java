package lezione2.riscaldamento;

import java.util.Scanner;

/*Scrivere un programma che chiede in input un nome e stampa la prima lettera e l'ultima (suggerimento: substring)*/
public class Es2 {
    public static void main(String[] args) {
     Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci nome: ");
        String nome = tastiera.next();
        System.out.println("Prima lettera: " + nome.substring(0,1));
        System.out.println("Ultima lettera: " + nome.substring(nome.length()-1));

    }
}