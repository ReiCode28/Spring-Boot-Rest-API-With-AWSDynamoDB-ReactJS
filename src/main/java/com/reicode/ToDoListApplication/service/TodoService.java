package com.reicode.ToDoListApplication.service;

import com.reicode.ToDoListApplication.model.TodoItem;
import com.reicode.ToDoListApplication.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoItem> getAllTodoItems() {
        return (List<TodoItem>) todoRepository.findAll();
    }

    public Optional<TodoItem> getTodoItemById(String id) {
        return todoRepository.findById(id);
    }

    public TodoItem createTodoItem(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    public TodoItem updateTodoItem(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }




    public void deleteTodoItem(String id) {
        todoRepository.deleteById(id);
    }
}




