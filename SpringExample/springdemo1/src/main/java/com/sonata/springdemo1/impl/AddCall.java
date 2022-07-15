package com.sonata.springdemo1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sonata.springdemo1.Addition;

@Component
@Scope(value="prototype")
public class AddCall {
	@Autowired
	Addition add;
	
	public int callAdd() {
		
		return add.add(10,40);
	}

}
