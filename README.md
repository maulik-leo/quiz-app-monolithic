## 🚀 Quiz App by LeoTech India

This repository contains the backend source code for the **Quiz App**, a robust and modern application designed for managing and delivering online quizzes.

-----

### 💻 Technology Stack

The application is built using a powerful and modern set of technologies:

| Category | Technology | Version |
| :--- | :--- | :--- |
| **Backend Framework** | Spring Boot | 3.5.8 |
| **Programming Language** | Java | 25 |
| **Build Tool** | Maven | N/A |
| **Web Service** | Spring Web (RESTful APIs) | N/A |
| **Persistence Layer** | Spring Data JPA | N/A |
| **Database** | MySQL | 8.4 |
| **Utility** | Lombok | N/A |

### 🛠️ Getting Started

Follow these steps to set up and run the application locally.

#### Prerequisites

  * Java Development Kit (JDK) 25
  * Apache Maven
  * MySQL 8.4 Server

#### 1\. Database Setup

You need to create a MySQL database instance.

1.  Log in to your MySQL server.

2.  Create a new database (e.g., `quiz_db` or `<YOUR_DB_NAME>`):

    ```sql
    CREATE DATABASE <YOUR_DB_NAME>;
    ```

3.  Update the `src/main/resources/application.properties` file with your database credentials:

    ```properties
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/<YOUR_DB_NAME>
    spring.datasource.username=<YOUR_MYSQL_USERNAME>
    spring.datasource.password=<YOUR_MYSQL_PASSWORD>
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

#### 2\. Build the Application

Navigate to the project root directory (`quiz-app`) and execute the following Maven command:

```bash
mvn clean install
```

This command cleans the build directory, compiles the code, and packages the application into a JAR file.

#### 3\. Run the Application

You can run the application directly from the command line using the generated JAR file:

```bash
java -jar target/quiz-app.jar
```

*(The exact JAR file name might vary slightly based on the version.)*

Alternatively, you can run it using the Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

The application will start on the default Spring Boot port (usually `8080`).

-----

### 📂 Project Structure

The core source code is located under `src/main/java/com/leotechindia/quiz_app`. The structure will follow standard Spring Boot conventions:

  * `controller`: For RESTful API endpoints.
    *  GET : ```/question/all``` (Retrieve All Questions)
  * `service`: For business logic.
  * `repository`: For database interaction (using Spring Data JPA).
  * `model` or `entity`: For database entities and data transfer objects (DTOs).

-----

### 📞 Contact

For any issues or questions, please contact **LeoTech India** at [maulikspatel295@gmail.com].

-----