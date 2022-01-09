package com.brody.application.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.brody.application.entities.User;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
