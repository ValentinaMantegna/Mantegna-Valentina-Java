package StruttureDatiEdEccezioni.src;

import java.util.ArrayList;
import java.util.List;

public class Persona2 {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String dataDiNascita;

    public Persona2(String codiceFiscale, String nome, String cognome, String dataDiNascita) {
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                '}';
    }
}


