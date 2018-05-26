package com.baja.spring.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/lifecycle/interfaces/config.xml");
		Patient patient = (Patient) cpx.getBean("patient");
		System.out.println(patient.getId());
		cpx.registerShutdownHook();
	}
}
