package com.leotechindia.quiz_app.model.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerOnly {
    int questionId;
    String answerByUser;
}