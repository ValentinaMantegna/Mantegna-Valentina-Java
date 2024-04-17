package com.alphatrasporti.payload;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fermata_Ferma_Linea implements Serializable {

    private String nomeFermata;
    private String nomeLinea;
    private String zona;


}
