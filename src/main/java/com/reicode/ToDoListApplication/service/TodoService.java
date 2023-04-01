package com.reicode.ToDoListApplication.service;

import com.reicode.ToDoListApplication.model.TodoItem;
import com.reicode.ToDoListApplication.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Iterable<TodoItem> getAllTodoItems() {
        return todoRepository.findAll();
    }

    public void addTodoItem(TodoItem todoItem) {
        todoRepository.save(todoItem);
    }

    public void updateTodoItem(TodoItem todoItem) {
        todoRepository.save(todoItem);
    }

    public void deleteTodoItem(String id) {
        todoRepository.deleteById(id);
    }
}
