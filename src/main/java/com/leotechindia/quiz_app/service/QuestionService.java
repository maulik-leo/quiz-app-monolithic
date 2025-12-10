package com.leotechindia.quiz_app.service;

import com.leotechindia.quiz_app.dao.QuestionDao;
import com.leotechindia.quiz_app.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public Question getQuestionById(int searchId) {
        Optional<Question> optQuestion = questionDao.findById(searchId);
        return optQuestion.orElse(null);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question newQuestion) {
        questionDao.save(newQuestion);
        return "Added new Question in " + newQuestion.getCategory() + " category !";
    }
}