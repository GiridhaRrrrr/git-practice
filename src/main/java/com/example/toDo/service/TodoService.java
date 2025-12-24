package com.example.toDo.service;

import com.example.toDo.model.Todo;
import com.example.toDo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepo repo;

    public List<Todo> getTodos() {
        return repo.findAll();
    }

    public Todo getTodoById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public void addProduct(Todo todo) {
        repo.save(todo);
    }

    public void updateProduct(Todo todo) {
        repo.save(todo);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
