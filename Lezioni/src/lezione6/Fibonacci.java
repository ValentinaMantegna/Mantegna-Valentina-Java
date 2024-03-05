package lezione6;
// Fibonacci: Implementa un metodo statico ricorsivo che restituisce l'n-esimo numero della sequenza di Fibonacci.
// Nella sequenza di Fibonacci, ogni numero è la somma dei due precedenti, con i primi due numeri che sono 0 e 1.
// Il metodo dovrebbe prendere un indice n come parametro e restituire il numero di Fibonacci corrispondente.
public class Fibonacci {
    public static int fibonacci(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }

    }

    public static void main(String[] args) {
        int indice= 10;
        int risultato= fibonacci(indice);
        System.out.println("Il risultato è "+ risultato);
    }
}
