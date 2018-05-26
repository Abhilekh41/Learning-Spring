package com.baja.spring.advanced.stereotype.annotation.scope;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/advanced/stereotype/annotation/scope/config.xml");
		Instructor instructor = (Instructor) cpx.getBean("instructor");
		System.out.println(instructor.hashCode());
		
		Instructor instructor2 = (Instructor) cpx.getBean("instructor");
		System.out.println(instructor2.hashCode());
	}
}
