package com.leotechindia.quiz_app.model.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String quizTitle;
	@ManyToMany
	private List<Question> questions;
}