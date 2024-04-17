package com.alphatrasporti.model;

import lombok.*;

import java.io.Serializable;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fermata implements Serializable
{

    private Integer idFermata;
    private String nomeFermata;
    private String zona; //Character perchè è una lettera seeno anche String
}
