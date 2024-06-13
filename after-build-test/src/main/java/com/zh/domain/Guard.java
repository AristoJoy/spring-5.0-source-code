package com.zh.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guard {
	private Animal animal;

	private Person person;

	@Autowired
	public void setAnimal(Animal animal) {
		System.out.println("animal setter");
		this.animal = animal;
	}

	@Autowired
	public void setPerson(Person person) {
		System.out.println("person setter");
		this.person = person;
	}

	@Override
	public String toString() {
		return "Guard{" +
				"animal=" + animal +
				", person=" + person +
				'}';
	}
}
