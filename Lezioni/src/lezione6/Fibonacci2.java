package lezione6;

public class Fibonacci2 {
    public static int calcolaFibonacci(int n) {
        // Caso base: se n è 0 o 1, restituiamo n
        if (n == 0 || n == 1) {
            return n;
        }

        // Caso ricorsivo: restituiamo la somma dei due numeri di Fibonacci precedenti
        return calcolaFibonacci(n - 1) + calcolaFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int indice = 6; // Indice desiderato
        int risultato = calcolaFibonacci(indice);
        System.out.println("Il numero di Fibonacci di indice " + indice + " è: " + risultato);
    }
}
