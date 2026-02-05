# ⚙️ Student Management System — Backend (Spring Boot)

This repository contains the **Backend** of the **Student Management System**, built using **Spring Boot**. It exposes secure, RESTful APIs for managing student records and follows a clean, industry-standard layered architecture. It is designed to work seamlessly with a React frontend hosted in a separate repository.

---

## 🚀 Overview

This backend application provides:

* REST APIs for full CRUD operations on students
* Layered architecture (Controller → Service → Repository)
* MySQL integration using Spring Data JPA & Hibernate
* Global exception handling
* CORS configuration for frontend integration
* Optional JWT-based authentication (if enabled)

It is built to be **scalable, maintainable, and interview-ready**.

---

## ✨ Features

### 🔹 Core Features

* RESTful APIs for Student Management
* Spring Data JPA with Hibernate ORM
* MySQL database integration
* Clean layered architecture
* Global Exception Handling (`@RestControllerAdvice`)
* CORS configuration for React frontend
* Lombok for reducing boilerplate code

### 🔹 (Optional) Security Features

* JWT-based authentication
* Spring Security integration
* Role-based access (Admin / User)

---

## 🏗️ Architecture

```
Client (React)
        ↓
Spring Security (Optional JWT Filter)
        ↓
Controller → Service → Repository → Database
```

---

## 🛠️ Technologies Used

* **Java 21**
* **Spring Boot**
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Lombok
* (Optional) Spring Security + JWT

---

## 📁 Project Structure

```
com.coding.SpringbootCRUD
│
├── controller
│   ├── StudentController
│   ├── AuthController
│
├── service
│   └── StudentService
│
├── repository
│   └── StudentRepository
│
├── entity
│   └── Student
│
├── exception
│   ├── ResourceNotFoundException
│   └── GlobalExceptionHandler
│
├── config
│   └── CorsConfig
│
└── SpringbootCrudApplication
```

---

## 📡 API Endpoints

### Authentication

```
POST /auth/login
```

### Students (Secured if JWT enabled)

```
GET    /students
GET    /students/{id}
POST   /students
PUT    /students/{id}
DELETE /students/{id}
```

---

## ▶️ How to Run Locally

### 1️⃣ Clone this repository

```bash
git clone https://github.com/chaitanyapawar99/student-backend.git
cd student-backend
```

### 2️⃣ Configure MySQL (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

Backend will start at:

```
http://localhost:8080
```

---

## 🔗 Frontend Connection (CORS)

Ensure CORS is enabled for React in:

```
CorsConfig.java
```

Example:

```java
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:5173")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
```

---

## 🔐 Authentication (If JWT is enabled)

If JWT is enabled:

* `/auth/login` generates a JWT token
* All other endpoints require:

```
Authorization: Bearer <your-token>
```

A custom JWT filter validates the token before reaching controllers.

---

## 🧠 What this backend demonstrates

* How to build REST APIs with Spring Boot
* How JPA maps Java objects to database tables
* How controllers, services, and repositories interact
* How to handle exceptions globally
* How to integrate a React frontend with Spring Boot

---

## 🔗 Frontend Repository

This backend works with the following frontend repository:

```
https://github.com/chaitanyapawar99/Student-Managment-System-Frontend
```

*(If your frontend repo name changes, tell me and I’ll update this.)*

---

## 🔮 Future Enhancements

* Add DTO layer
* Implement database-based authentication
* Add pagination & sorting
* Add logging (SLF4J + Logback)
* Deploy to cloud (Render / Railway / AWS)

---

⭐ If you find this project useful, please give it a star!
