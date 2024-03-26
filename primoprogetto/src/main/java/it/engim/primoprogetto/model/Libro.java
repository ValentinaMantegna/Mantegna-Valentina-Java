package it.engim.primoprogetto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {

    private String autore;
    private String titolo;
    private int annoPubblicazione;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) //per avere l'autoincrement
    private int id;


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}


