package com.example.todo.repo;

import com.example.todo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}