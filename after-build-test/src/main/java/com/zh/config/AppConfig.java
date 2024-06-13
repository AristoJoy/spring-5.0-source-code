package com.zh.config;

import com.zh.domain.Animal;
import com.zh.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zh")
public class AppConfig {

	@Bean
	public Animal animal() {
		return new Animal("xh", "tiger");
	}

	@Bean
	public Movie movie() {
		return new Movie();
	}
}
