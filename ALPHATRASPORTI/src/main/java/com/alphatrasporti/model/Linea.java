package com.alphatrasporti.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Linea implements Serializable{

    private Integer idLinea;
    private String NomeLinea;
}
