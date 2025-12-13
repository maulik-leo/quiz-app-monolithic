package com.leotechindia.quiz_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leotechindia.quiz_app.model.entity.Question;
import com.leotechindia.quiz_app.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	// 1. Search All available questions
	@GetMapping("all")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}

	// 2. Search question with specified ID
	@GetMapping("id/{search_id}")
	public ResponseEntity<Question> getQuestionById(@PathVariable("search_id") int search_id) {
		return questionService.getQuestionById(search_id);
	}

	// 3. Search question with specified CATEGORY
	@GetMapping("cat/{search_category}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("search_category") String category) {
		return questionService.getQuestionsByCategory(category);
	}

	// 4. Add question
	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody Question newQuestion) {
		return questionService.addQuestion(newQuestion);
	}
}