package com.udemy.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>  {
}
