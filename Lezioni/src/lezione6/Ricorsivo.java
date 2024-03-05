package lezione6;

public class Ricorsivo {
    //count down ricorsivo

    public static void countdown(int x) {

        if (x > 0) {
            System.out.println(x);
            countdown(x - 1);
        } else

            System.out.println("Boom!");
    }
    public static void main(String[] args) {
 countdown(10);
    }
}
