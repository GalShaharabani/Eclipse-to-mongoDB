package com.company.RestToMongoTest;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	private int id;
	private String name;
	private ArrayList<Profession> professions;

	public Person(int id, String name, ArrayList<Profession> professions) {
		super();
		this.id = id;
		this.name = name;
		this.professions = professions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Profession> getProfessions() {
		return professions;
	}

	public void setProfessions(ArrayList<Profession> professions) {
		this.professions = professions;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", professions=" + professions + "]";
	}

}
