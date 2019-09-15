package com.rickywong.dojooverflow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rickywong.dojooverflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{

	Optional<Question> findByQuestion(String string);
	List<Question> findAll();

}