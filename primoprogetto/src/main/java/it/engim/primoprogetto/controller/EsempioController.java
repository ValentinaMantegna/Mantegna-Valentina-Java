package it.engim.primoprogetto.controller;

import it.engim.primoprogetto.model.Libro;
import it.engim.primoprogetto.model.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EsempioController {
    @Autowired
    LibroRepository libroRepository; //deve salvare qua dentro con Autowired(inizializza senza new
    // accedere dal controller ai libri
    @GetMapping("/getLibri") //fa una REST API=> sottopagine restituite in jsono
    public List<Libro> getLibri() {
        return libroRepository.findAll();
    }

    @GetMapping("/addLibro")
    public String addLibro(@RequestParam(value="titolo") String titolo,
                           @RequestParam(value="autore") String autore,
                           @RequestParam(value="anno") int annoPubblicazione) {
        Libro libro = new Libro();
        libro.setTitolo(titolo);
        libro.setAutore(autore);
        libro.setAnnoPubblicazione(annoPubblicazione);
        libroRepository.save(libro);
        return "OK";

    }
}
