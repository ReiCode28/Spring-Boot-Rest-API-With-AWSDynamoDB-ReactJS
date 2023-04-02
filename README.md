Todo List Application
=====================

This is the backend for a Todo List application that allows users to create, read, update, and delete tasks. The application is built using Spring Boot and DynamoDB. The frontend will be built using React.js

Technologies Used
-----------------

-   Java
-   Spring Boot
-   DynamoDB
-   Postman

Features
--------

-   Create tasks
-   Read tasks
-   Update tasks
-   Delete tasks

Getting Started
---------------

To run the application locally, follow these steps:

1.  Clone the repository
2.  Install Java and Maven
3.  Configure your AWS credentials and region in the `application.properties` file
4.  Run the application using the `mvn spring-boot:run` command

Usage
-----

To use the application, you can send HTTP requests to the API using a tool like Postman. Here are the available endpoints:

-   GET /api/todo: Get all tasks
-   POST /api/todo: Create a task
-   GET /api/todo/{id}: Get a task by ID
-   PUT /api/todo/{id}: Update a task by ID
-   DELETE /api/todo/{id}: Delete a task by ID

Examples
--------

Here are some examples of HTTP requests you can make to the API using Postman:

-   Get all tasks:
    -   Method: GET
    -   URL: `http://localhost:8080/api/todo`
-   Create a task:
    -   Method: POST
    -   URL: `http://localhost:8080/api/todo`
    -   Body:

        jsonCopy code

        `{ "title": "Buy groceries", "description": "Buy milk, eggs, and bread" }`

-   Get a task by ID:
    -   Method: GET
    -   URL: `http://localhost:8080/api/todo/1`
-   Update a task by ID:
    -   Method: PUT
    -   URL: `http://localhost:8080/api/todo/1`
    -   Body:

        jsonCopy code

        `{ "title": "Buy groceries", "description": "Buy milk, eggs, bread, and cheese" }`

-   Delete a task by ID:
    -   Method: DELETE
    -   URL: `http://localhost:8080/api/todo/1`

Future Improvements
-------------------

-   Add authentication and authorization
-   Add pagination to the GET all tasks endpoint
-   Add sorting to the GET all tasks endpoint
