package com.example.todo.controller;

import com.example.todo.model.TodoItem;
import com.example.todo.repo.TodoRepo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;


    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }
}
