package com.company.RestToMongoTest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfessionRepository extends MongoRepository<Profession, Integer> {

}
