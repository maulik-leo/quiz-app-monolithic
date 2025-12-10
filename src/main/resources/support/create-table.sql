CREATE TABLE question (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    category varchar(255) NULL,
    difficulty_level varchar(255) NULL,
    option1 varchar(255) NULL,
    option2 varchar(255) NULL,
    option3 varchar(255) NULL,
    option4 varchar(255) NULL,
    question_title varchar(255) NULL,
    right_answer varchar(255) NULL
);