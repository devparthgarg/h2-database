# Spring Boot H2 Integration Demo

This is a simple Java Spring Boot project demonstrating integration with an in-memory H2 database. It includes two REST APIs to manage employee records.

## Features

- In-memory H2 Database integration  
- API to **create** an employee  
- API to **retrieve all** employees  
- Easy access to H2 Console for data inspection

## Running the Application

1. Start the Spring Boot application.
2. Open the H2 console in your browser:
   - [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: *(leave empty)*

## API Endpoints

### Add Employee
```
curl --location 'http://localhost:8080/v1/create' \
--header 'Content-Type: application/json' \
--data '{
    "name":"Manvi"
}'
```
### Get All Employees
```
curl --location 'http://localhost:8080/v1/get/all'
```
