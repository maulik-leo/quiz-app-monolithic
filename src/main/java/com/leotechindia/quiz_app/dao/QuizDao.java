package com.leotechindia.quiz_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leotechindia.quiz_app.model.entity.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {
}