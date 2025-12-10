
-----

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

### 🌐 API Endpoints

The Quiz App exposes the following RESTful endpoints for managing questions. The base URL for all endpoints is typically `http://localhost:8080`.

|  No.  | HTTP Method | Endpoint                          | Description | Request Body                            | Response Body                     |
|:-----:|:------------|:----------------------------------| :--- |:----------------------------------------|:----------------------------------|
| **1** | `GET`       | `/question/all`                   | Retrieves a list of all questions available in the database. | *None*                                  | `List<Question>`                  |
| **2** | `GET`       | `/question/id/{search_id}`        | Retrieves a single question based on its unique ID. | *None*                                  | `Question` Object                 |
| **3** | `GET`       | `/question/cat/{search_category}` | Retrieves questions filtered by a specific category (e.g., JAVA, CSS). | *None*                                  | `List<Question>`                  |
| **4** | `POST`      | `/question/add`                   | Creates and persists a new question in the database. | `Question` Object (JSON)                | Success/Error Message             |
| **5** | `POST`      | `/quiz/create`                    | **Creates a new quiz** using a specified category, number of questions, and a title. | JSON: `{category, numQuestions, title}` | Quiz ID or Success/Error Message  |
| **6** | `GET`       | `/quiz/get/{quiz_id}`             | **Retrieves all questions** that belong to the specified quiz ID. | *None*                                  | `List<Question>`                  |
| **7** | `POST`      | `/quiz/submit/{quiz_id}`          | **Submits user answers** for a quiz and returns the final score. | JSON:`List<Answers>`(User's answers)    | e.g.`Score : 3 / 5` (Final Score) |

> **Note:** Endpoints for Quizzes (`/quiz/*`), updates, and deletes are **coming soon**.

-----

### 📂 Project Structure

The core source code is located under `src/main/java/com/leotechindia/quiz_app`. The structure will follow standard Spring Boot conventions:

* `controller`: For RESTful API endpoints. (See **API Endpoints** section above)
* `service`: For business logic.
* `repository`: For database interaction (using Spring Data JPA).
* `model` or `entity`: For database entities and data transfer objects (DTOs).

-----

### 📞 Contact

For any issues or questions, please contact **LeoTech India**.

-----