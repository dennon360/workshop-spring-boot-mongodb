package com.dennon.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dennon.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
