package com.leotechindia.quiz_app.controller;

import com.leotechindia.quiz_app.model.Question;
import com.leotechindia.quiz_app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Search All available questions
    @GetMapping("all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    // Search question with specified ID
    @GetMapping("id/{search_id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable("search_id") int search_id) {
        return questionService.getQuestionById(search_id);
    }

    // Search question with specified CATEGORY
    @GetMapping("cat/{search_category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("search_category") String category) {
        return questionService.getQuestionsByCategory(category);
    }

    // Add question
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question newQuestion) {
        return questionService.addQuestion(newQuestion);
    }
}