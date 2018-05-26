package com.baja.spring.advanced.stereotype.annotation.value.collection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("com/baja/spring/advanced/stereotype/annotation/value/collection/config.xml");
		Instructor instructor = (Instructor) cpx.getBean("instructor");
		System.out.println(instructor);
	}
}
