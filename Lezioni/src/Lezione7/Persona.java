package Lezione7;

import lezione6.Forme.Colore;

public class Persona {
    private String nome;
    private String cognome;
    private int altezza;
    private String coloreOcchi;
    private String sesso;

    public enum Sesso { //dare una lista di nomi con enum
        UOMO, DONNA, NON_BINARIO
    }

    public Persona(String nome, String cognome, int altezza, String coloreOcchi, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.altezza = altezza;
        this.coloreOcchi = coloreOcchi;
        this.sesso = sesso;
    }

    public static void main(String[] args) {
       new Persona("Carlo","Cracco",180, "VERDE", "UOMO");
    }
}

