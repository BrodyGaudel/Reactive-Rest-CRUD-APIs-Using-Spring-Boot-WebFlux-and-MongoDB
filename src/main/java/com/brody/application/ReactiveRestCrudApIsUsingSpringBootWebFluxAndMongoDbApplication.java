package com.brody.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactiveRestCrudApIsUsingSpringBootWebFluxAndMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestCrudApIsUsingSpringBootWebFluxAndMongoDbApplication.class, args);
	}

}
