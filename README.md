# 📓 Journal App (Spring Boot + MongoDB)

<!-- BADGES START -->
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-Database-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-Persistence-blue?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-Developer%20Tools-FF6F00?style=for-the-badge)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-orange?style=for-the-badge)
![Redis](https://img.shields.io/badge/Redis-Caching-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-Messaging-231F20?style=for-the-badge&logo=apachekafka&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit%205-Testing-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-Mocking-78C257?style=for-the-badge)
![Swagger](https://img.shields.io/badge/Swagger-API%20Docs-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)
![SonarQube](https://img.shields.io/badge/SonarQube-Code%20Quality-4E9BCD?style=for-the-badge&logo=sonarqube&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Heroku](https://img.shields.io/badge/Heroku-Deploy-430098?style=for-the-badge&logo=heroku&logoColor=white)
<!-- BADGES END -->

---

## 📘 Project Overview

The **Journal App** is a secure and scalable backend application built using **Java + Spring Boot**.  
It allows users to create, manage, and organize personal journal entries with **JWT-based authentication**, **role-based access**, and **well-structured REST APIs**.

The application uses **MongoDB** for document-based storage and supports advanced backend practices like **Redis caching**, **Kafka messaging**, **Swagger API documentation**, **JUnit 5 + Mockito testing**, and **SonarQube code quality checks**.  
It is designed to reflect **production-ready architecture** and real-world backend engineering standards.

---

## 🧰 Technologies Used

- **Backend:** Java, Spring Boot, REST APIs  
- **Database:** MongoDB  
- **ORM / Persistence:** Hibernate, JPA *(if used in hybrid modules)*  
- **Security:** Spring Security, JWT, Role-Based Access Control (RBAC)  
- **Caching:** Redis  
- **Messaging:** Apache Kafka  
- **API Documentation:** Swagger / OpenAPI  
- **Testing:** JUnit 5, Mockito  
- **Code Quality:** SonarQube  
- **Build Tool:** Maven  
- **Deployment:** Heroku  
- **Developer Tools:** Lombok  

---

## 🎯 Key Outcomes of the Project

- Built a **secure Journal Management system** with RESTful APIs
- Implemented **Spring Security + JWT authentication**
- Designed scalable backend services with **clean layered architecture**
- Stored and managed journal entries using **MongoDB**
- Improved performance using **Redis caching**
- Enabled asynchronous workflows using **Apache Kafka**
- Documented APIs using **Swagger**
- Ensured reliability via **JUnit 5 and Mockito testing**
- Maintained code quality with **SonarQube**
- Deployed application on **Heroku** for public access

---

## 🧩 Core Modules / Components

1. Authentication & Authorization (JWT + Spring Security)
2. User Module
3. Journal Entry Module
4. Tags / Categories Module *(optional / if implemented)*
5. Redis Cache Layer
6. Kafka Producer & Consumer Events
7. Swagger API Documentation
8. JUnit 5 + Mockito Test Suite
9. SonarQube Quality Checks
10. Deployment Pipeline (Heroku)

---

## 👤 User Module

Manages user accounts and authentication.

### Features
- User Registration & Login
- Secure password handling
- JWT token generation and validation
- Role-based access control (**USER / ADMIN**)
- Profile management

---

## 📓 Journal Entry Module

Manages creation and organization of journal entries.

### Features
- Create new journal entries
- View all journal entries (user-specific)
- View entry by ID
- Update existing entries
- Delete entries
- Search/filter entries *(by date/title/tags if implemented)*

---

## 🔐 Security (Spring Security + JWT)

Security is implemented using **Spring Security** with **JWT-based stateless authentication**:

- JWT validation for protected endpoints
- Role-based authorization (USER/ADMIN)
- Secure access for user-specific journal entries
- Prevents unauthorized access to other users’ data

---

## ⚡ Redis Caching

Redis is used for caching frequently accessed data to reduce DB load and improve response times.

### Cached Data Examples
- User profile details
- Frequently requested journal entries *(as per implementation)*

---

## 🔄 Apache Kafka Integration

Kafka is used for **asynchronous and event-driven processing**.

### Use Cases
- Journal entry created/updated events
- Notification or audit logging events *(if implemented)*
- Decouples services for scalability

---

## 📄 Swagger API Documentation

- Interactive API documentation using Swagger UI
- Provides endpoint details, request/response formats, and testing support

---

## 🧪 Testing (JUnit 5 + Mockito)

- Unit testing for service and controller layers
- Mockito used for mocking dependencies
- Ensures stable and reliable API behavior

---

## ✅ Code Quality (SonarQube)

- Static code analysis for bugs, vulnerabilities, and code smells
- Ensures maintainability and clean code standards

---

## 🚀 Deployment (Heroku)

- Application deployed on **Heroku**
- Production-ready configuration using environment variables
- Suitable for sharing project demo with recruiters

---

## 🙏 Thank You

Thank you for exploring this **Journal App** project.  
Happy coding! 🚀
