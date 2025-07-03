package com.example.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoItem {

    private Long id;
    private String title;
    private boolean done;

    public TodoItem() {

    }

    @Id
    @GeneratedValue
    public Long getId() {

        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}