package com.company.RestToMongoTest;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class RestToMongoTestApplication {
	
	public static void main(String[] args) {
		
	
		ApplicationContext ctx = SpringApplication.run(RestToMongoTestApplication.class, args);
		System.out.println("start");
		try {
			
			ProfessionRepository profRepo = ctx.getBean(ProfessionRepository.class);
			PersonRepository personRepo = ctx.getBean(PersonRepository.class);
			Profession profession=new Profession(1, "Java", "Fullstack");
			profRepo.save(profession);
			Profession profession2=new Profession(2, "Python", "Machine learning");
			profRepo.save(profession2);
			ArrayList<Profession>professions=new ArrayList<>();
			professions.add(profession);
			professions.add(profession2);
			Person person=new Person(1, "moshe", professions);
			personRepo.save(person);
			System.out.println("profession was added successfully");
			System.out.println(profRepo.findAll());
			System.out.println("person add successfully");
			System.out.println(personRepo.findAll());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
