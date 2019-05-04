package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.entities.Question;

@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question, Integer> {


}
