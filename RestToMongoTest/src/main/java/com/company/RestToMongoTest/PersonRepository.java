package com.company.RestToMongoTest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Integer> {

}
