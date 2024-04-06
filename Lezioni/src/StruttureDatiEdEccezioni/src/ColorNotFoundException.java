package StruttureDatiEdEccezioni.src;

import java.util.ArrayList;
import java.util.List;

public class ColorNotFoundException extends Exception {
    public static final String EXC_MESSAGE = "Il colore non è presente nell'array";

    public ColorNotFoundException() {
    }

    public ColorNotFoundException(String message) {
        super(message);

    }
}