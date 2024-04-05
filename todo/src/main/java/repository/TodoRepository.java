package repository;

import it.engim.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//interfeccia che si genera sql per chiamare il database=> scrive solo la firma
public interface TodoRepository extends CrudRepository<Todo, Integer> {

    List<Todo> findAll();

    Todo findById(int id); //se passiamo un Id ci restituisce un Todo

}
