package com.reicode.ToDoListApplication.repository;

import com.reicode.ToDoListApplication.model.TodoItem;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface TodoRepository extends CrudRepository<TodoItem, String> {
}
