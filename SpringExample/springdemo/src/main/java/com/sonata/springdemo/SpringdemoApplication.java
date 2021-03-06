package com.sonata.springdemo;
import com.sonata.springdemo.impl.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sonata.springdemo.impl.Add;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		AddressBook book1 = (AddressBook) ctx.getBean("addressBook");
		Address addr = (Address) ctx.getBean("address");
		addr.setEmail("a@gmail.com");
		addr.setLname("S A");
		addr.setFname("Aditya");
		addr.setAddress("Bangalore");
		addr.setPcode(1234);
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		addr.setCountry("India");
		book1.add(addr);
		//System.out.println(book1.add(addr));
		//book1.view();
		//book1.search("a@gmail.com");
		//System.out.println(book1.search("a@gmail.com"));
		"a@gmail.com","S A","Aditya","bangalore","Bangalore","Karnataka","India",56064
	}

}
