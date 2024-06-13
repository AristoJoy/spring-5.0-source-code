package com.zh.test;

import com.zh.config.AppConfig;
import com.zh.domain.Guard;
import com.zh.domain.Movie;
import com.zh.domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//		Person person = ac.getBean(Person.class);
//		System.out.println(person);
		Person person1 = (Person) ac.getBean("person");
		System.out.println(person1);
		System.out.println(ac.getBean(Guard.class));

		Movie movie = ac.getBean(Movie.class);
		ac.registerShutdownHook();
	}
}
