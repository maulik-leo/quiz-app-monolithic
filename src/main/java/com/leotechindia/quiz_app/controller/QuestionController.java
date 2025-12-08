package com.leotechindia.quiz_app.controller;

import com.leotechindia.quiz_app.model.Question;
import com.leotechindia.quiz_app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("all")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
