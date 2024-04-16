package com.studiofotografico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Entity
public class StudioFotografico {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nomeCliente;
    private String aataSessione;
    private String tipoSessione;
    private String statoPrenotazione;
    private String note;
}
