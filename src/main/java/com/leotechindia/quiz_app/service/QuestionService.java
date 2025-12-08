package com.leotechindia.quiz_app.service;

import com.leotechindia.quiz_app.dao.QuestionDao;
import com.leotechindia.quiz_app.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}