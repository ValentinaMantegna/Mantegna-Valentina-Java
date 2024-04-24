package com.biblioteca.model;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Libro implements Serializable {
    private String codiceIsbn;
    private String titolo;
    private String autore;
    private String genere;
    private String anno_pubblicazione;
}
