package com.alphatrasporti.payload;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FermataLinea implements Serializable {

    private String nomeFermata;
    private String nomeLinea;
    private String zona;


}
