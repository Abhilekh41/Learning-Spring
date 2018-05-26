package com.baja.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) cpx.getBean("prescription");
		System.out.println(prescription.getId());
	}
}
