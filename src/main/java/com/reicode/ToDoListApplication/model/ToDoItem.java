package com.reicode.ToDoListApplication.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "TodoItem")
public class ToDoItem {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "title")
    private String title;

    @DynamoDBAttribute(attributeName = "description")
    private String description;

    @DynamoDBAttribute(attributeName = "completed")
    private boolean completed;

}
