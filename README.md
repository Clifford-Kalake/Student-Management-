# Student-Management-

This is a Spring Boot and Thymeleaf-based Student Management System.

## Features
- List all students
- Add a new student
- Edit student details
- Delete a student

## Prerequisites
Before you begin, ensure you have met the following requirements:
- **Java**: JDK 8 or higher
- **Maven**: Maven 3.6.0 or higher
- **MySQL**: MySQL 5.7 or higher

## Setup and Running the Application

### 1. Clone the Repository
Clone the repository to your local machine.

### 2. Configure the Database
Update the database configuration in src/main/resources/application.properties with your MySQL credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/student_management?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

### 3. Create the Database
Create the student_management database in your MySQL server. You can do this using the MySQL command line or a database management tool like phpMyAdmin.
CREATE DATABASE student_management;

### 4. Build the Project

### 5. Run the Application

### 6. Access the Application
Open your browser and go to http://localhost:8080/students to access the student management system.

