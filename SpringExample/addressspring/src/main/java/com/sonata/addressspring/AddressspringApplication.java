package com.sonata.addressspring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class AddressspringApplication {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ApplicationContext ctx = SpringApplication.run(AddressspringApplication.class, args);
				//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
				//Address ad=ctx.getBean("address", Address.class);
				AddressBook book = (AddressBook) ctx.getBean("addressBook");
				System.out.println(book);	

			}

	}


