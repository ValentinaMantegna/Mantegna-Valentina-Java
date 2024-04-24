package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Utente;
import com.biblioteca.repository.LibroRepository;
import com.biblioteca.repository.UtenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/utente")
public class UtenteController {
    @GetMapping(value = "/selectAllUtenti")
    public static List<Utente> selectUtenti()  {
        return UtenteRepository.selezionaTuttiUtenti();
    }
}
