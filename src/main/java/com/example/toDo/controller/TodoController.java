package com.example.toDo.controller;

import com.example.toDo.model.Todo;
import com.example.toDo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService service;

    @GetMapping("/todos/get")
    public List<Todo> getTodos()
    {
        return service.getTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoBYId(@PathVariable int id)
    {
        return service.getTodoById(id);
    }

    @PostMapping("/todos/add")
    public void addProduct(@RequestBody Todo todo)
    {
        System.out.println(todo);
        service.addProduct(todo);
    }

    @PutMapping("/todos/update")
    public void updateProduct(@RequestBody Todo todo)
    {
        service.updateProduct(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }
}
