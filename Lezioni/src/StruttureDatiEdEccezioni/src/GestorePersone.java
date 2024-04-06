package StruttureDatiEdEccezioni.src;

public interface GestorePersone {

    class PersonaAlreadyExistException extends Exception {
        public static final String EXC_MESSAGE = "Persona con lo stesso CF già esistente.";

        public PersonaAlreadyExistException() {
            super(EXC_MESSAGE);
        }

        public PersonaAlreadyExistException(String message) {
            super(message);
        }
    }

    class PersonaNotFoundException extends Exception {
        public static final String EXC_MESSAGE = "Persona non trovata per il CF fornito.";

        public PersonaNotFoundException() {
            super(EXC_MESSAGE);
        }

        public PersonaNotFoundException(String message) {
            super(message);
        }
    }
}
