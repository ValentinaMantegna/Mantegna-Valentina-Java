package StruttureDatiEdEccezioni.src;

import java.util.Date;
//Scrivere un programma che dato un oggetto persona, inserisca all’interno di un arraylist più persone;
//Inserire una persona controllando se esiste già una persona con lo stesso CF. Se esiste PersonaAlreadyExistException;
//Creare un metodo e cercare una persona mediante il CF e restituire l’istanza della persona trovata, altrimenti PersonaNotFoundException.
//Dato un arraylist di persone cercare le persone che sono nate lo stesso giorno e stampare le loro istanze.
public class Persona {
    private String nome;
    private String cognome;
    private String CF;
    private String nascita ;

    public Persona(String nome, String cognome, String CF, String nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.CF = CF;
        this.nascita = nascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getNascita() {
        return nascita;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }
    //metodo info
    public String InfoPersona() {
        return "Persona: "+ nome +", CF: "+ CF + "Data di nascita: "+ nascita;
    }
}

