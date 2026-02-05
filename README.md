# ⚙️ Student Management System — Backend (Spring Boot)

This repository contains the **Backend** of a Student Management System built using **Spring Boot**. It exposes REST APIs for managing student records and follows a clean, layered architecture suitable for production-grade applications.

---

## 🎯 Objective

The purpose of this backend is to:

* Expose RESTful APIs for CRUD operations
* Demonstrate layered architecture (Controller–Service–Repository)
* Integrate Spring Boot with MySQL using JPA/Hibernate
* Implement global exception handling
* Enable cross-origin communication with a React frontend

---

## ✨ Features

* ✅ REST APIs for Students
* ✅ Spring Data JPA + Hibernate ORM
* ✅ MySQL Database Integration
* ✅ Layered Architecture
* ✅ Global Exception Handling (`@RestControllerAdvice`)
* ✅ CORS Configuration for frontend integration
* ✅ Clean and maintainable code structure

---

## 🏗️ Architecture

```
Controller → Service → Repository → Database
```

---

## 🛠️ Technologies Used

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Lombok

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

### Students

```
GET    /students
GET    /students/{id}
POST   /students
PUT    /students/{id}
DELETE /students/{id}
```

---

## ▶️ How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/student-backend.git
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

Backend will start on:

```
http://localhost:8080
```

---

## 💡 What this backend demonstrates

* How Spring Boot builds REST APIs
* How JPA maps Java objects to database tables
* How controllers, services, and repositories work together
* How to handle exceptions globally

---

## 🔮 Future Enhancements

* Add JWT Authentication
* Add DTO Layer
* Add Pagination
* Add Logging (SLF4J + Logback)
* Deploy to cloud

---

⭐ If you find this useful, please give it a star!
