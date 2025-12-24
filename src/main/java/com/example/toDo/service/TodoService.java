package com.example.toDo.service;

import com.example.toDo.model.Todo;
import com.example.toDo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepo repo;

    public List<Todo> getTodos() {
        return repo.findAll();
    }

    public void addProduct(Todo todo) {
        repo.save(todo);
    }

    public Todo getTodoById(int id) {
        return repo.findById(id).orElse(new Todo());
    }

    public void updateProduct(Todo todo) {
        List<Todo> all = getTodos();
         Todo tt = all.stream()
                .filter(t -> t.getId() == todo.getId())
                 .findFirst()
                 .orElseThrow(() -> new RuntimeException("Todo not found"));

         repo.save(tt);

    }
}
