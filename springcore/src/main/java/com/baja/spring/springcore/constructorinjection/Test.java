package com.baja.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/constructorinjection/config.xml");
		Employee employee = (Employee) cpx.getBean("emp");
		System.out.println(employee.getAddress().getCity());
	}
}
