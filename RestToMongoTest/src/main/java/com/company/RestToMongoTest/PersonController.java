package com.company.RestToMongoTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class PersonController {
	
	@Autowired
	private ProfessionRepository pRepo;
	@Autowired
	private PersonRepository personRepo;
	
	@PostMapping("/add")
	public ResponseEntity<?> addPerson(@RequestBody Person p){
		personRepo.save(p);
		return new ResponseEntity<>(p.getId(), HttpStatus.OK);
	}
}
