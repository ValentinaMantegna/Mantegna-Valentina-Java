package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.repository.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/libro")
public class LibroController {
    @GetMapping(value = "/selectAllLibri")
    public static List<Libro> selectLibri() {
        return LibroRepository.selezionaTuttiLibri();
    }

    @PostMapping("/addLibri")
    public static String InserisciLibro(@RequestBody Libro libro) {

        return LibroRepository.inserisciLibro(libro);
    }

   @GetMapping("/SelezioneByGenere")

    public static String getLibroByGenere(@RequestParam String genere) {
        return LibroRepository.getLibroByGenere(genere);
   }
}


