//Scrivere un programma che calcoli la somma della diagonale principale di una matrice;
public class SommaDiagonalePrincipale {


        public static void main(String[] args) {
            int[][] matrice = {
                    {14, 22, 34},
                    {47, 59, 65},
                    {70, 80, 92}
            };

            int sommaDiagonale = 0;
            for (int i = 0; i < matrice.length; i++) {
                sommaDiagonale += matrice[i][i];
            }

            System.out.println("La somma della diagonale principale è: " + sommaDiagonale);
        }
    }
