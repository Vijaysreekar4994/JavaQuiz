package com.demo.services;

import com.demo.entities.Question;

public interface QuestionService {

	public Iterable<Question> findAll();
	
	public int findAnswerIdCorrect(int questionId);

}
