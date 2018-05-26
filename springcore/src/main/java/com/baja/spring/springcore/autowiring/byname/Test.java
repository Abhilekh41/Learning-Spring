package com.baja.spring.springcore.autowiring.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/autowiring/byname/config.xml");
		Employee emp = (Employee) cpx.getBean("emp");
		System.out.println(emp.getAddress().getCity());
	}
} 
