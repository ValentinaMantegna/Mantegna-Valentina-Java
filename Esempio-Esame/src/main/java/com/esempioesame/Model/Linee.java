package com.esempioesame.Model;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Linee {

    private int Id_Linee;
    private String Nome;
    private List<Fermate> fermate; //tab. fermata_linea è qui dentro
}
