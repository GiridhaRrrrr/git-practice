package com.example.toDo.controller;

import com.example.toDo.model.Todo;
import com.example.toDo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoService service;

    @GetMapping("/")
    public List<Todo> getTodos()
    {
        return service.getTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoBYId(@PathVariable int id)
    {
        return service.getTodoById(id);
    }

    @PostMapping("/")
    public void addProduct(@RequestBody Todo todo)
    {
        System.out.println(todo);
        service.addProduct(todo);
    }

    @PutMapping("/")
    public void updateProduct(@RequestBody Todo todo)
    {
        service.updateProduct(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }
}
