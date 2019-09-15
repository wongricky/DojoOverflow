package com.rickywong.dojooverflow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rickywong.dojooverflow.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	Optional<Tag> findById(Long id);
	Tag findBySubject(String subject);
	List<Tag> findAll();
}
