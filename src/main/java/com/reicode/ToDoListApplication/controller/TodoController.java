package com.reicode.ToDoListApplication.controller;

import com.reicode.ToDoListApplication.model.TodoItem;
import com.reicode.ToDoListApplication.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<List<TodoItem>> getAllTodoItems() {
        List<TodoItem> todoItems = todoService.getAllTodoItems();
        return new ResponseEntity<>(todoItems, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addTodoItem(@RequestBody TodoItem todoItem) {
        todoService.addTodoItem(todoItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTodoItem(@PathVariable String id, @RequestBody TodoItem todoItem) {
        todoItem.setId(id);
        todoService.updateTodoItem(todoItem);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoItem(@PathVariable String id) {
        todoService.deleteTodoItem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
