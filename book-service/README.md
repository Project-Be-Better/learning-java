# Book Service API

A RESTful web service built with Spring Boot for managing a book catalog. This service provides CRUD operations for books with PostgreSQL database integration.

## 🚀 Features

- ✅ **CRUD Operations** - Create and Read books (Update/Delete coming soon)
- ✅ **PostgreSQL Integration** - Robust database with Docker setup
- ✅ **RESTful API** - Standard HTTP methods and status codes
- ✅ **Data Validation** - Input validation and error handling
- ✅ **Sample Data** - 200+ pre-loaded books for testing
- ✅ **Modern Architecture** - Layered design with best practices

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA** - Database abstraction layer
- **PostgreSQL** - Primary database
- **Docker** - Database containerization
- **Maven** - Dependency management
- **Lombok** - Boilerplate code reduction

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- Docker and Docker Compose
- DBeaver or any PostgreSQL client (optional)
- Postman or similar API testing tool

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone <your-repo-url>
cd book-service
```

### 2. Start PostgreSQL Database

```bash
# Start PostgreSQL container
docker run -d \
  --name sql-service \
  -e POSTGRES_USER=pguser \
  -e POSTGRES_PASSWORD=pgpass \
  -e POSTGRES_DB=taskhub \
  -p 5432:5432 \
  postgres:15

# Verify container is running
docker ps
```

### 3. Configure Application

The application is pre-configured with the following database settings in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskhub
spring.datasource.username=pguser
spring.datasource.password=pgpass
spring.jpa.hibernate.ddl-auto=update
```

### 4. Load Sample Data

Run the SQL script in DBeaver or your PostgreSQL client:

```bash
# Connect to database and execute
scripts/data.sql  # Contains 200 sample books
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📊 Database Schema

### Books Table

```sql
CREATE TABLE books (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(100) NOT NULL,
    isbn VARCHAR(13) NOT NULL,
    description VARCHAR(3000) NOT NULL,
    price DECIMAL(10,2)
);
```

## 🔌 API Endpoints

### Base URL: `http://localhost:8080/api/books`

| Method   | Endpoint          | Description          | Status         |
| -------- | ----------------- | -------------------- | -------------- |
| `GET`    | `/api/books`      | Get all books        | ✅ Implemented |
| `POST`   | `/api/books`      | Create a new book    | ✅ Implemented |
| `GET`    | `/api/books/{id}` | Get book by ID       | 🔄 Coming soon |
| `PUT`    | `/api/books/{id}` | Update existing book | 🔄 Coming soon |
| `DELETE` | `/api/books/{id}` | Delete book          | 🔄 Coming soon |

### API Examples

#### Get All Books

```http
GET /api/books
Accept: application/json
```

**Response:**

```json
[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "isbn": "9780132350884",
    "description": "A Handbook of Agile Software Craftsmanship",
    "price": 45.99
  }
]
```

#### Create a New Book

```http
POST /api/books
Content-Type: application/json

{
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "9780134685991",
  "description": "Best practices for the Java platform",
  "price": 52.99
}
```

**Response:**

```json
{
  "id": 201,
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "isbn": "9780134685991",
  "description": "Best practices for the Java platform",
  "price": 52.99
}
```

## 🧪 Testing with Postman

### Import Collection

1. Open Postman
2. Create new collection "Book Service API"
3. Add requests for each endpoint

### Test Scenarios

1. **Get all books** - Should return 200+ books
2. **Create new book** - Should return 201 Created
3. **Create duplicate** - Should handle gracefully
4. **Invalid data** - Should return appropriate errors

## 📁 Project Structure

```
book-service/
├── src/
│   ├── main/
│   │   ├── java/com/roneai/bookservice/
│   │   │   ├── controller/
│   │   │   │   └── BookController.java      # REST endpoints
│   │   │   ├── entity/
│   │   │   │   └── Book.java                # JPA entity
│   │   │   ├── repository/
│   │   │   │   └── BookRepository.java      # Data access layer
│   │   │   ├── service/
│   │   │   │   └── BookService.java         # Business logic
│   │   │   └── BookServiceApplication.java  # Main application
│   │   └── resources/
│   │       └── application.properties       # Configuration
├── scripts/
│   └── data.sql                            # Sample data (200 books)
├── pom.xml                                 # Maven dependencies
└── README.md                              # This file
```

## 🏗️ Architecture

The application follows a **layered architecture** pattern:

```
┌─────────────────┐
│   Controller    │ ← REST API endpoints
├─────────────────┤
│    Service      │ ← Business logic
├─────────────────┤
│   Repository    │ ← Data access
├─────────────────┤
│    Entity       │ ← Data model
├─────────────────┤
│   PostgreSQL    │ ← Database
└─────────────────┘
```

### Key Components

- **BookController**: Handles HTTP requests and responses
- **BookService**: Contains business logic and validation
- **BookRepository**: Provides database operations via Spring Data JPA
- **Book Entity**: Maps to the `books` database table

## 🔧 Configuration

### Application Properties

```properties
# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/taskhub
spring.datasource.username=pguser
spring.datasource.password=pgpass
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true

# Application Configuration
spring.application.name=book-service
```

## 🚀 Future Enhancements

### Planned Features

- [ ] **Complete CRUD** - Update and Delete operations
- [ ] **Search & Filtering** - Find books by author, price range, genre
- [ ] **Pagination** - Handle large datasets efficiently
- [ ] **File Upload** - Book cover images (Local storage + AWS S3)
- [ ] **Validation** - Advanced input validation and error handling
- [ ] **Authentication** - JWT-based security
- [ ] **API Documentation** - Swagger/OpenAPI integration
- [ ] **Unit Testing** - Comprehensive test suite
- [ ] **Docker Compose** - Complete containerization

### Advanced Features (Later)

- [ ] **Microservices** - Split into multiple services
- [ ] **Caching** - Redis integration for performance
- [ ] **Message Queues** - Async processing with RabbitMQ
- [ ] **Monitoring** - Actuator + Prometheus + Grafana
- [ ] **CI/CD Pipeline** - GitHub Actions or Jenkins

## 🐛 Troubleshooting

### Common Issues

#### Database Connection Failed

```bash
# Check if PostgreSQL container is running
docker ps

# Restart container if needed
docker restart sql-service
```

#### Table Not Found

```bash
# Restart application to recreate tables
mvn spring-boot:run
```

#### Port Already in Use

```bash
# Find process using port 8080
netstat -ano | findstr :8080

# Kill the process and restart
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📚 Learning Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [REST API Best Practices](https://restfulapi.net/)
