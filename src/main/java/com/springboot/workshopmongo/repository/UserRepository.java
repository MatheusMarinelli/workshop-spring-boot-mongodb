package com.springboot.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.workshopmongo.domain.User;

@Repository
// <Tipo da classe que será gerenciada, tipo do ID da classe (atributo ID da classe User é String)>
public interface UserRepository extends MongoRepository<User, String> {

}
