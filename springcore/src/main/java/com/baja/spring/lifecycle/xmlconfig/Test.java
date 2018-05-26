package com.baja.spring.lifecycle.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) cpx.getBean("patient");
		System.out.println(patient.getId());
		cpx.registerShutdownHook();
	}
}
