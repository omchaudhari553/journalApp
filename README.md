<div align="center">

# 📓 JournalApp

### Secure Personal Journal Management Application

A full-stack application that allows users to securely create, manage, and organize personal journal entries online. Built with a scalable Spring Boot REST API and modern frontend, the application supports secure authentication, role-based access, and complete CRUD operations for private journal records.

<br/>

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-6.0-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-Cache-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![Kafka](https://img.shields.io/badge/Apache_Kafka-Event_Streaming-000000?style=for-the-badge&logo=apachekafka)
![JWT](https://img.shields.io/badge/JWT-Security-000000?style=for-the-badge&logo=jsonwebtokens)


</div>

---

## ✨ Features

| Module | Description |
|---|---|
| 🔐 **Authentication** | Secure user registration and login using JWT authentication |
| 👤 **User Management** | User profile management with secure access |
| 📓 **Journal Entries** | Create, update, delete, and view personal journal entries |
| 🔒 **Authorization** | Role-based access for admin and user |
| ✅ **Validation** | Frontend + backend input validation |
| 📖 **Swagger UI** | Interactive API documentation |
| ☁️ **Deployment Ready** | Backend and frontend can be deployed on cloud platforms |

---

## 🛠 Tech Stack

### Backend

| Layer | Technology |
|---|---|
| Framework | Spring Boot 3.x · Java 17 |
| Security | Spring Security · JWT |
| Persistence | Spring Data JPA · Hibernate · MySQL |
| Validation | Jakarta Bean Validation |
| Documentation | SpringDoc OpenAPI · Swagger UI |
| Build Tool | Maven |

### Frontend

| Layer | Technology |
|---|---|
| Framework | React.js |
| Styling | CSS / Bootstrap |
| API Integration | Axios |
| State Management | React Hooks |

---

## 🚀 Getting Started

### Prerequisites

| Tool | Version |
|---|---|
| Java | 17+ |
| Maven | 3.8+ |
| Node.js | 18+ |
| npm | 9+ |
| MySQL | 8.0+ |

---

### 1 · Clone the repository

```bash
git clone https://github.com/your-username/journalapp.git
cd journalapp
```

---

### 2 · Database setup

```sql
CREATE DATABASE journal_db;
```

Update database credentials in `application.properties`.

---

### 3 · Backend setup

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

> API starts at **http://localhost:8080**  
> Swagger UI: **http://localhost:8080/swagger-ui.html**

---

### 4 · Frontend setup

```bash
cd frontend
npm install
npm start
```

> Frontend runs at **http://localhost:3000**

---

## 📁 Project Structure

```text
journalapp/
├── backend/
│   ├── src/main/java/com/journalapp/
│   │   ├── controller/
│   │   │   ├── AuthController.java
│   │   │   └── JournalController.java
│   │   ├── service/
│   │   ├── repository/
│   │   ├── entity/
│   │   │   ├── User.java
│   │   │   └── JournalEntry.java
│   │   ├── security/
│   │   └── config/
│   └── resources/
│       └── application.properties
│
└── frontend/
    ├── src/
    │   ├── components/
    │   ├── pages/
    │   ├── services/
    │   └── App.js
```

---

## 🌐 API Reference

All endpoints except authentication require:

```http
Authorization: Bearer <jwt_token>
```

### Authentication

| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/api/auth/register` | Register new user |
| `POST` | `/api/auth/login` | Login user |

### Journal

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/journals` | Get all journal entries |
| `GET` | `/api/journals/{id}` | Get journal by ID |
| `POST` | `/api/journals` | Create new journal entry |
| `PUT` | `/api/journals/{id}` | Update journal entry |
| `DELETE` | `/api/journals/{id}` | Delete journal entry |

---

## 🔐 Security Features

- JWT-based authentication  
- Password encryption using BCrypt  
- Spring Security integration  
- Role-based authorization  
- Protected REST APIs  

---

## 📌 Future Enhancements

- AI-powered mood analysis for journal entries  
- Search and filter journal history  
- Image upload support  
- Cloud deployment with AWS  
- Docker containerization  

---

## 👨‍💻 Author

Developed by **Om Chaudhari** as a full-stack Java project to demonstrate backend development, secure authentication, and REST API design using Spring Boot.
