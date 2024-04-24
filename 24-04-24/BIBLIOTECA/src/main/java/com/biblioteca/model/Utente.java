package com.biblioteca.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Utente implements Serializable {
    private String codiceUtente;
    private String nome;
    private String cognome;
}
