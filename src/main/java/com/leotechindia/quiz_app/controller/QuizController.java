package com.leotechindia.quiz_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leotechindia.quiz_app.model.dto.AnswerOnly;
import com.leotechindia.quiz_app.model.dto.QuestionOnly;
import com.leotechindia.quiz_app.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService quizService;

	// 5. Create Quiz using CATEGORY, NUM-OF-QUESTION, QUIZ-TITLE
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam("cat") String category, @RequestParam("noQ") int numOfQuestion, @RequestParam("qTitle") String quizTitle) {
		return quizService.createQuiz(category, numOfQuestion, quizTitle);
	}

	// 6. Get all questions of specific QUIZ using QUIZ-ID
	@GetMapping("get/{quiz_id}")
	public ResponseEntity<List<QuestionOnly>> getQuiz(@PathVariable("quiz_id") int quizId) {
		return quizService.getQuiz(quizId);
	}

	// 7. Submit specific QUIZ with QUIZ-ID and QUIZ-ANSWERS for getting QUIZ-SCORE
	@PostMapping("submit/{quiz_id}")
	public ResponseEntity<String> calculateQuizScore(@PathVariable("quiz_id") int quizId, @RequestBody List<AnswerOnly> answers) {
		return quizService.calculateQuizScore(quizId, answers);
	}
}
