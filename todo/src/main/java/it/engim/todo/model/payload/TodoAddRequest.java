package it.engim.todo.model.payload;

import java.util.Date;
//i parametri che vogliamo avere nel nostro database=> quello che vogliamo aggiungere deve avere almeno questi
//parametri
public class TodoAddRequest {

    private String titolo;

    private Date scadenza;

    private String priorita;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public String getPriorita() {
        return priorita;
    }

    public void setPriorita(String priorita) {
        this.priorita = priorita;
    }
}
