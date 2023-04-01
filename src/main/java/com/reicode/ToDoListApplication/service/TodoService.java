package com.reicode.ToDoListApplication.service;

import com.reicode.ToDoListApplication.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoItem> getAllTodoItems() {
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
