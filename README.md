# Trivia App Backend

A REST API for a trivia quiz application built with Spring Boot.

## Tech Stack
- Java 17
- Spring Boot 4.0
- Spring Security + JWT
- MySQL
- Hibernate/JPA
- Lombok

## Endpoints
- POST /users/register
- POST /users/login
- GET /categories
- GET /questions?categoryId=3
- POST /scores

## Setup
1. Clone the repo
2. Create application.properties from application.properties.example
3. Run `mvn clean package`
4. Run `java -jar target/triviaapp-0.0.1-SNAPSHOT.jar`
