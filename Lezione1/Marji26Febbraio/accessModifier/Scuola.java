package Marji26Febbraio.accessModifier;

public class Scuola {
    private String nomeScuola;
    private String indirizzoScuola;
    private String gradoScuola;

    public Scuola() {}

        public Scuola(String nomeScuola, String indirizzoScuola, String gradoScuola){

        this.nomeScuola = nomeScuola;
        this.indirizzoScuola = indirizzoScuola;
        this.gradoScuola = gradoScuola;

        }

        public void setNomeScuola(String nomeScuola) { // modifico il valore con set

        this.nomeScuola = nomeScuola;
        }

        public String getNomeScuola() { //ottengo il valore
        return this.nomeScuola;
        }

    public String getIndirizzoScuola() {
        return indirizzoScuola;
    }

    public void setIndirizzoScuola(String indirizzoScuola) {
        this.indirizzoScuola = indirizzoScuola;
    }

    public String getGradoScuola() {
        return gradoScuola;
    }

    public void setGradoScuola(String gradoScuola) {
        this.gradoScuola = gradoScuola;
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "nomeScuola='" + nomeScuola + '\'' +
                ", indirizzoScuola='" + indirizzoScuola + '\'' +
                ", gradoScuola='" + gradoScuola + '\'' +
                '}';
    }
}
