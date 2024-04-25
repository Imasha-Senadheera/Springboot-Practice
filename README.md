# Spring Boot Student Management System

This is a simple Spring Boot project created to practice building RESTful APIs for managing student records.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Running the Application](#running-the-application)

## Introduction

This project provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on student records. It includes endpoints for retrieving all students, registering a new student, deleting a student by ID, and updating a student's information.
<br> <br> 
<img width="600" alt="1" src="https://github.com/Imasha-Senadheera/Springboot-Practice/assets/121493197/e812975f-5cf3-457c-a654-e34ff1123f78" >

<br> 

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Project Structure

The project is structured as follows:

- `com.example.demo.student`: Contains classes related to the student entity, repository, service, and controller.
- `com.example.demo`: Contains the main application class (`DemoApplication`) and configuration files.
- `test`: Contains test classes for unit and integration testing.

## Setup Instructions

To set up and run the project locally, follow these steps:

1. Clone this repository to your local machine:
2. Configure the PostgreSQL database by updating the application.properties file with your database credentials.
3. Build the project using Maven: ` mvn clean package` 


## API Endpoints
The following API endpoints are available:

- `GET /api/v1/student` : Retrieve all students.
- `POST /api/v1/student` : Register a new student.
- `DELETE /api/v1/student/{studentId}` : Delete a student by ID.
- `PUT /api/v1/student/{studentId}` : Update a student's information by ID.
  
## Running the Application
- After building the project, you can run the application using the following command: `java -jar target/demo-0.0.1-SNAPSHOT.jar` 
- The application will start on port 8090 by default. You can change the port in the application.properties file if needed.




