package com.baja.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) cpx.getBean("employee");
		System.out.println(employee.getAddress().getCity());
	}
}
