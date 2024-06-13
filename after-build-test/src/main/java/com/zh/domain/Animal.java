package com.zh.domain;

import org.springframework.beans.factory.annotation.Value;

public class Animal {

	private String name;


	private String type;

	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Animal(String name) {
		this(name, "");
	}

	public Animal() {
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
