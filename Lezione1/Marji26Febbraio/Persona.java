package Marji26Febbraio;
// @author Valentina Mantegna
public class Persona {
    public String nomePersona;
    public String cognomePersona;
    public Integer etaPersona;

    protected String coloreCapelli;

    public Persona() // costruttore
    {

    }

    /** Costruttore
     *
     * @param nomePersona nome della persona con cui si vuole istanziare l'oggetto
     * @param cogmomePersona cognome della persona con cui si vuole istanziare l'oggetto
     */
 public Persona( String nomePersona, String cogmomePersona) //overload
    {
     this.nomePersona = nomePersona; // per lavorare con gli oggetti all'interno della classe si utilizza this
     this.cognomePersona = cognomePersona;
    }

    public Persona(String nomePersona, String cognomePersona, Integer etaPersona) // non dà problemi perchè ha più parametri di quello sopra
    {
        this.nomePersona = nomePersona; //
        this.cognomePersona = cognomePersona;
        this.etaPersona = etaPersona;
    }
    /**   @Override
   public String toString() {
     return Persona{ "" +
                 "nomePersona='" + nomePersona
     }**/

    @Override // Alt + Ins
    public String toString() {
        return "Persona{" +
                "nomePersona='" + nomePersona + '\'' +
                ", cognomePersona='" + cognomePersona + '\'' +
                ", etaPersona=" + (etaPersona == null ? 0 : etaPersona)+
                '}';
    }
}

