package com.zh.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Movie {

	@PostConstruct
	public void init() {
		System.out.println("Movie start!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Movie end");
	}
}
