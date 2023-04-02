package com.reicode.ToDoListApplication.service;

import com.reicode.ToDoListApplication.model.TodoItem;
import com.reicode.ToDoListApplication.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<TodoItem> getAllTodoItems() {
        Iterable<TodoItem> todoItemsIterable = todoRepository.findAll();
        List<TodoItem> todoItemsList = new ArrayList<>();
        todoItemsIterable.forEach(todoItemsList::add);
        return todoItemsList;
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
