package StruttureDatiEdEccezioni.src;

import java.util.ArrayList;
import java.util.List;

public class Main implements GestorePersone {
    public static void main(String[] args) {
        List<Persona2> persone = new ArrayList<>();
        Main main = new Main(); // Creazione di un'istanza di Main per poter chiamare i metodi dell'interfaccia GestorePersone
        try {
            main.aggiungiPersona(persone, new Persona2("ABC123", "Mario", "Rossi", "1990-01-01"));
            main.aggiungiPersona(persone, new Persona2("DEF456", "Giuseppe", "Verdi", "1985-05-20"));
            main.aggiungiPersona(persone, new Persona2("GHI789", "Luigi", "Bianchi", "1990-01-01"));
            main.aggiungiPersona(persone, new Persona2("ABC123", "Giorgio", "Neri", "1992-03-15")); // Duplicato
        } catch (PersonaAlreadyExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            Persona2 personaTrovata = main.trovaPersonaPerCodiceFiscale(persone, "DEF456");
            System.out.println("Persona trovata: " + personaTrovata);
        } catch (PersonaNotFoundException e) {
            System.out.println(e.getMessage());
        }

        main.cercaPersoneStessoGiornoNascita(persone, "1990-01-01");
    }


    public void aggiungiPersona(List<Persona2> persone, Persona2 nuovaPersona) throws PersonaAlreadyExistException {
        for (Persona2 persona : persone) {
            if (persona.getCodiceFiscale().equals(nuovaPersona.getCodiceFiscale())) {
                throw new PersonaAlreadyExistException("Persona con lo stesso CF già esistente.");
            }
        }
        persone.add(nuovaPersona);
    }


    public Persona2 trovaPersonaPerCodiceFiscale(List<Persona2> persone, String codiceFiscale) throws PersonaNotFoundException {
        for (Persona2 persona : persone) {
            if (persona.getCodiceFiscale().equals(codiceFiscale)) {
                return persona;
            }
        }
        throw new PersonaNotFoundException("Persona non trovata per il CF fornito.");
    }

 
    public void cercaPersoneStessoGiornoNascita(List<Persona2> persone, String data) {
        List<Persona2> personeStessoGiorno = new ArrayList<>();
        for (Persona2 persona : persone) {
            if (persona.getDataDiNascita().equals(data)) {
                personeStessoGiorno.add(persona);
            }
        }
        if (!personeStessoGiorno.isEmpty()) {
            System.out.println("Persone nate lo stesso giorno:");
            for (Persona2 persona : personeStessoGiorno) {
                System.out.println(persona);
            }
        } else {
            System.out.println("Nessuna persona trovata nata lo stesso giorno.");
        }
    }
}
