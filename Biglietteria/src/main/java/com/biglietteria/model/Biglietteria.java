package com.biglietteria.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//grazie a queste annotazioni(Lombok) non abbiamo bisogno di scrivere queelle cose,non vediamo codici
// costruttore,getter,setter
public class Biglietteria implements Serializable {

    private String codiceBiglietteria;
    private String Indirizzo;
    private String nomeBiglietteria;
}
