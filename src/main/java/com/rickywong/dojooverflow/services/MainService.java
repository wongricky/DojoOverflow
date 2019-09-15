package com.rickywong.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rickywong.dojooverflow.models.Answer;
import com.rickywong.dojooverflow.models.Question;
import com.rickywong.dojooverflow.models.Tag;
import com.rickywong.dojooverflow.repositories.AnswerRepository;
import com.rickywong.dojooverflow.repositories.QuestionRepository;
import com.rickywong.dojooverflow.repositories.TagRepository;

@Service
public class MainService {
	private final QuestionRepository qRepository;
	private final TagRepository tRepository;
	private final AnswerRepository aRepository;
	
	public MainService (QuestionRepository qRepository,
			TagRepository tRepository, AnswerRepository aRepository) {
		this.qRepository = qRepository;
		this.tRepository = tRepository;
		this.aRepository = aRepository;
	}
	
	public List<Question> allQuestions() {
		return qRepository.findAll();
	}
	
	public List<Tag> allTags() {
		return tRepository.findAll();
	}
	
	public List<Answer> allAnswer() {
		return aRepository.findAll();
	}
	
	public Question createQuestion(String question) {
		Question q = new Question(question);
		return qRepository.save(q);
	}
	
	public Question updateQuestion(Question question) {
		return qRepository.save(question);
	}
	
	public Tag createTag(Tag tag) {
		return tRepository.save(tag);
	}
	
	public Tag createStringTag (String tag) {
		Tag newTag = new Tag (tag);
		return tRepository.save(newTag);
	}
	
	public Answer createAnswer(Answer answer) {
		return aRepository.save(answer);
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = qRepository.findById(id);
        if(optionalQuestion.isPresent()) {
            return optionalQuestion.get();
        }
        else {
            return null;
        }
	}
	
	public Tag findBySubject(String subject) {
		return tRepository.findBySubject(subject);
	}
}
