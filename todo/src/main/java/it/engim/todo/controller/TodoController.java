package it.engim.todo.controller;


import it.engim.todo.model.Todo;
import it.engim.todo.model.payload.TodoAddRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.TodoRepository;

import java.util.Date;
import java.util.List;

@RestController
public class TodoController {

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
        todo.setDataInserimento(new Date());
        todoRepository.save(todo); //salva nella repository

        return "OK";
    }
    @GetMapping("/todo/all")
            public List<Todo> allTodo() {
            return todoRepository.findAll();
            }
}