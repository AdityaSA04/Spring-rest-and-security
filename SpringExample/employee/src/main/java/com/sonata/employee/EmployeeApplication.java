package com.sonata.employee;


import org.springframework.context.support.ClassPathXmlApplicationContext;


//@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee e1 = (Employee)ac.getBean("emp1");
		System.out.println(e1);
	}

}
