package it.engim.todo.controller;


import it.engim.todo.model.Todo;
import it.engim.todo.model.payload.TodoAddRequest;
import it.engim.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
@Autowired
TodoRepository todoRepository;

// TodoAddRequest tipo , todoRequest = varibile
    @PostMapping("/todo/add") //URL che vogliamo dargli
    public String addTodo(@RequestBody TodoAddRequest todoRequest) {

        Todo todo = new Todo();

        todo.setTitolo(todoRequest.getTitolo());

        todo.setScadenza(todoRequest.getScadenza());

        if(todoRequest.getPriorita().equals("A"))
            todo.setPriorita(Todo.Priorita.ALTA);

        else if(todoRequest.getPriorita().equals("B"))
            todo.setPriorita(Todo.Priorita.BASSA);
        else
            todo.setPriorita(Todo.Priorita.NORMALE);
        todo.setCompletato(false);
       // todo.setIncompleto(true);
        todo.setDataInserimento(new Date());
        todoRepository.save(todo); //salva nella repository

        return "OK";
    }
    @GetMapping("/todo/all")
            public List<Todo> allTodo() {
            return todoRepository.findAll();
            }

            //controllo per ogni elemento che la priorita sia ALTA
    @GetMapping("/todo/alta")
            public List<Todo> prioritaAltaTodo(){
        List<Todo> list = todoRepository.findAll();
        List<Todo> listAlta = new ArrayList<>();
        for(Todo t : list) {
            if(t.getPriorita().equals(Todo.Priorita.ALTA))
                listAlta.add(t);

            //condizione per controllare che una data è prima di oggi
            //if(t.getScadenza().compareTo(new Date()) < 0)
             //   listAlta.add(t);
        }

        //ALTERNATIVA:
                //filter: fa for if e add=> qui fa un foreach e usa la funzione per ogni elemento
                //poi tutto viene convertito in una lista;
                //stream è presente perchè prepara filter
                //dentro la funzione freccia passsa ciò che voglio filtrare
                List<Todo> listAlta2 = list.stream().filter(todo ->todo.getPriorita().equals(Todo.Priorita.ALTA)).toList();
        //list.stream().filter(x->x%2==0).toList()
                //oppure voglio usare sorted:
                //list.stream().filter(x->x%2==0).sorted(todo->todo.getPriorita().compareTo *faremo più avanti
        return listAlta;
            }

            @GetMapping("/todo/completato")
            public List<Todo> completatoTodo(){
                List<Todo> list = todoRepository.findAll();
                List<Todo> listComplete = new ArrayList<>();
                for(Todo t : list) {
                    if (t.isCompletato())
                        listComplete.add(t);
                }
                    return listComplete;
                }






    //UPODATE= cerchiamo l'oggetto e lo modifichiamo
@GetMapping("/todo/completed/{id}")
public String setCompleted(@PathVariable String id) {
    Optional<Todo> todoOp = todoRepository.findById(Integer.parseInt(id));
    Todo todo;
    if(todoOp.isPresent()) {
        todo = todoOp.get();
        todo.setCompletato(true);
        todoRepository.save(todo);
    }
    // Metodo + elegante:
//        Todo todo2 = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
//         todo2.setCompletato(true);
//        todoRepository.save(todo2);
    return "OK";
}

    @GetMapping("/todo/uncompleted/{id}")
    public String setUncompleted(@PathVariable String id) {
        Todo todo = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
        todo.setCompletato(true);
        todoRepository.save(todo);
        return "OK";
    }


    @GetMapping("/todo/remove/{id}")
    public String removeTodo(@PathVariable String id) {

        // Metodo 1
        Todo todo = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
        todoRepository.delete(todo);

        // Metodo 2
        //    if(todoRepository.existsById(Integer.parseInt(id)))
        //       todoRepository.deleteById(Integer.parseInt(id));
        return "OK";

    }

}