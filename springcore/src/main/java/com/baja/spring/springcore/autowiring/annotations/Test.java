package com.baja.spring.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/autowiring/annotations/config.xml");
		Employee emp = (Employee) cpx.getBean("emp");
		System.out.println(emp.getAddress());
	}
} 
