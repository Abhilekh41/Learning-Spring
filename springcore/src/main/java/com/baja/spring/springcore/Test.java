package com.baja.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/config.xml");
		Employee emp= (Employee)cpx.getBean("emp");
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getAddress().getCity());
	}
} 
