package com.sonata.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sonata.springdemo1.impl.Add;
import com.sonata.springdemo1.impl.AddCall;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Springdemo1Application.class, args);
		//Addition add = new Add();
		//System.out.println(add.add(30, 40));
		AddCall  addCall = (AddCall) ctx.getBean("addCall");
		AddCall  addCall1 = (AddCall) ctx.getBean("addCall");
		System.out.println(addCall.callAdd());
		System.out.println(addCall);
		System.out.println(addCall1);
		
	}

}
