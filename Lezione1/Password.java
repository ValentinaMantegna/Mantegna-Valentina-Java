import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String password = tastiera.nextLine();

        boolean isValid = true;

        if (password.length() < 8) {
            isValid = false;
        } else {
            int digitCount = 0;

            for (int i = 0; i < password.length() && isValid; i++) {
                char c = password.charAt(i);

                if (!Character.isLetterOrDigit(c) ){
                    isValid = false;
                }

                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }

            if (digitCount < 2) {
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("La password è valida.");
        } else {
            System.out.println("La password non è valida.");
        }
    }
}

