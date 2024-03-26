package it.engim.primoprogetto.model.repository;

import it.engim.primoprogetto.model.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Integer> {
    //prendimi l'interfaccia che deve prendere i libri, integer è il tipo della primary key=> consigliato
    //mettere Integer
    List<Libro> findAll();
    //metodo che prende tutti i libri che abbiamo in database e i mette dentro arrayList
    //Libro

}
