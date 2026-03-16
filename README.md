# Shiv-springboot-mysql-api-crud
Springboot
# Student Management API

A REST API built with Spring Boot for managing students.

## Technologies Used
- Spring Boot 3.3.5
- MySQL Database
- JPA/Hibernate
- Validation & Exception Handling

## Features
- Student CRUD Operations
- Input Validation
- Custom Exception Handling

## API Endpoints

### Students
- GET    /students      - Get all students
- GET    /students/{id} - Get student by id
- POST   /students      - Add new student
- PUT    /students/{id} - Update student
- DELETE /students/{id} - Delete student

## How to Run

### Prerequisites
- Java 17
- MySQL
- Maven

### Setup
1. Clone the repository
2. Create MySQL database:
   CREATE DATABASE studentdb;
3. Update application.properties:
   spring.datasource.username=root
   spring.datasource.password=yourpassword
4. Run the application:
   mvn spring-boot:run

## Testing with Postman

### Add Student:
POST /students
{
    "name": "Shiv",
    "email": "shiv@gmail.com"
}

### Get All Students:
GET /students

### Update Student:
PUT /students/1
{
    "name": "Shiv Updated",
    "email": "shivnew@gmail.com"
}

### Delete Student:
DELETE /students/1
