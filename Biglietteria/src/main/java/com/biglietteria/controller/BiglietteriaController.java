package com.biglietteria.controller;


import com.biglietteria.model.Biglietteria;
import com.biglietteria.repository.BiglietteriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //permette di accettare le richieste di tipo Rest del view/postMan
@RequestMapping("biglietteria/") //prefisso indirizzo dei miei metodi
public class BiglietteriaController {

    /*metodo di prova
    @GetMapping("saluta")
    public static String salutaBene()
    {

        return "CIAOO";
    }*/

    @GetMapping("selezionaTutteBiglietterie") //esegue http get
    public static List<Biglietteria> selezionaTutteBiglietterie()
    {
        return BiglietteriaRepository.selezionaBiglietterie();
    }
}
