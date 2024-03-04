package com.dennon.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dennon.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	public List<Post> findByTitleContainingIgnoreCase(String text);
}
