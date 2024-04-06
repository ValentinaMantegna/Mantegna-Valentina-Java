package Lezione7.Veicoli;

public class Persona {
    private String nome;
    private String cognome;
    private int numeroVeicoliPosseduti;
    private Veicolo[] veicoli;


    public Persona(String nome, String cognome, int numeroVeicoliPosseduti, Veicolo[] veicoli) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroVeicoliPosseduti = numeroVeicoliPosseduti;
        this.veicoli = new Veicolo[numeroVeicoliPosseduti];
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        if(veicolo instanceof Auto || veicolo instanceof Moto) {
            veicoli[numeroVeicoliPosseduti] = veicolo;
            numeroVeicoliPosseduti++;
            System.out.println("Aggiunto veicolo");
           
                System.out.println("Solo chi ha la patente può guidare moto e auto");
            };
        }
    }

