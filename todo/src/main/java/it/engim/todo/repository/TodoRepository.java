package it.engim.todo.repository;

import it.engim.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//interfeccia che si genera sql per chiamare il database=> scrive solo la firma
public interface TodoRepository extends CrudRepository<Todo, Integer> {

    List<Todo> findAll();
    Optional<Todo> findById(int id);

    //Todo findById(int id); //se passiamo un Id ci restituisce un "Tod"

}
