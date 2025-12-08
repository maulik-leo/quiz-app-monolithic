package com.leotechindia.quiz_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int questionId;
    String category;
    String difficultyLevel;
    String questionTitle;
    String option1;
    String option2;
    String option3;
    String option4;
    String rightAnswer;
}
