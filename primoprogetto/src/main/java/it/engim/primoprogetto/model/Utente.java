package it.engim.primoprogetto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utente {

    private String user;
    private String nome;
    private String cognome;
    private String mail;

    @Id
    private int id;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
