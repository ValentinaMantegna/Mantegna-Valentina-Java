package com.esempioesame.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Preventivo {
    private int id;
    private String fornitore;
    private String nome;
    private int maxFermate;
    private int maxExtraurbane;
    private int maxZone;
    private double prezzo;

}
