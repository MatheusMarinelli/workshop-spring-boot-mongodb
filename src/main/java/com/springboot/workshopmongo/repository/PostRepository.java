package com.springboot.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.workshopmongo.domain.Post;

@Repository
// <Tipo da classe que será gerenciada, tipo do ID da classe (atributo ID da classe Post é String)>
public interface PostRepository extends MongoRepository<Post, String> {

}
