package com.example.toDo.repository;

import com.example.toDo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Integer> {
}
