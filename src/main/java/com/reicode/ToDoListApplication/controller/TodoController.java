package com.reicode.ToDoListApplication.controller;

import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.reicode.ToDoListApplication.model.TodoItem;
import com.reicode.ToDoListApplication.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        return todoService.getAllTodoItems();
    }

    @GetMapping("/{id}")
    public Optional<TodoItem> getTodoItemById(@PathVariable String id) {
        return todoService.getTodoItemById(id);
    }

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        logger.info("Received request to add todo item: {}", todoItem);

        TodoItem addedTodoItem = todoService.createTodoItem(todoItem);
        logger.info("Added todo item: {}", addedTodoItem);

        return addedTodoItem;
    }


    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable String id, @RequestBody TodoItem updatedTodoItem) {
        Optional<TodoItem> todoItemOptional = todoService.getTodoItemById(id);
        if (todoItemOptional.isPresent()) {
            TodoItem todoItem = todoItemOptional.get();
            todoItem.setDescription(updatedTodoItem.getDescription());
            todoItem.setCompleted(updatedTodoItem.isCompleted());
            return todoService.updateTodoItem(todoItem);
        } else {
            throw new ResourceNotFoundException("Todo item not found with id " + id);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoItem(@PathVariable String id) {
        todoService.deleteTodoItem(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}



