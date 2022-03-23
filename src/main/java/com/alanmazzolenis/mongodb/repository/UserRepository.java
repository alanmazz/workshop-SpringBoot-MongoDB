package com.alanmazzolenis.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alanmazzolenis.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
