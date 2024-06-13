package com.zh.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircleA {

	@Autowired
	private CircleB circleB;
}
